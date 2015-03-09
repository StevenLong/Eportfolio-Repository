using System;
using System.Diagnostics;
using System.Resources;
using System.Windows;
using System.Windows.Markup;
using System.Windows.Navigation;
using Microsoft.Phone.Controls;
using Microsoft.Phone.Shell;
using CS_GO_Shopping_List.Resources;

namespace CS_GO_Shopping_List
{
    public partial class App : Application
    {
        /// <summary>
        /// Provides easy access to the root frame of the Phone Application.
        /// </summary>
        /// <returns>The root frame of the Phone Application.</returns>
        public static PhoneApplicationFrame RootFrame { get; private set; }

        // Initialize Cart Object
        public Cart c = new Cart();

        //Initailize Equipment Object
        public static Equipment desertEagle = new Equipment("Desert Eagle", "Pistol", 700);

        public static Equipment dualBerettas = new Equipment("Dual Berettas", "Pistol", 500);

        public static Equipment glock18 = new Equipment("Glock-18", "Pistol", 200);

        public static Equipment fiveSeven = new Equipment("Five-seveN", "Pistol", 500);

        public static Equipment tec9 = new Equipment("Tec-9", "Pistol", 500);

        public static Equipment P2000 = new Equipment("P2000", "Pistol", 200);

        public static Equipment P250 = new Equipment("P250", "Pistol", 300);

        public static Equipment XM1014 = new Equipment("XM1014", "Shotgun", 500);

        public static Equipment mag7 = new Equipment("MAG-7", "Shotgun", 1800);

        public static Equipment nova = new Equipment("Nova", "Shotgun", 1200);

        public static Equipment sawedOff = new Equipment("Sawed-Off", "Shotgun", 1200);

        public static Equipment ppBizon = new Equipment("PP-Bizon", "Submachine Gun", 1400);

        public static Equipment p90 = new Equipment("P90", "Submachine Gun", 2350); 
        
        public static Equipment mp7 = new Equipment("MP7", "Submachine Gun", 1700);
        
        public static Equipment ump45 = new Equipment("UMP-45", "Submachine Gun", 1200);
        
        public static Equipment mac10 = new Equipment("MAC-10", "Submachine Gun", 1050);

        public static Equipment mp9 = new Equipment("MP9", "Submachine Gun", 1250);

        public static Equipment awp = new Equipment("AWP", "Rifle", 4750);

        public static Equipment ak47 = new Equipment("AK-47", "Rifle", 2700);

        public static Equipment m4a4 = new Equipment("M4A4", "Rifle", 3100);

        public static Equipment ssg08 = new Equipment("SSG 08", "Rifle", 1700);

        public static Equipment aug = new Equipment("AUG", "Rifle", 3300);

        public static Equipment g3 = new Equipment("G3SG1", "Rifle", 5000);

        public static Equipment sg553 = new Equipment("SG553", "Rifle", 5000);
        
        public static Equipment scar20 = new Equipment("SCAR-20", "Rifle", 5000);

        public static Equipment famas = new Equipment("FAMAS", "Rifle", 2250);

        public static Equipment galilAR = new Equipment("Galil AR", "Rifle", 2000);

        public static Equipment negev = new Equipment("Negev", "Machine Gun", 5700);

        public static Equipment m249 = new Equipment("M249", "Machine Gun", 5200);

        public static Equipment zeus = new Equipment("Zeus x27", "Equipment", 400);

        public static Equipment armor = new Equipment("Kevlar Vest + Helmet", "Equipment", 1000);

        public static Equipment vest = new Equipment("Kevlar Vest", "Equipment", 650);

        public static Equipment HEGrenade = new Equipment("HE Grenade", "Grenade", 300);

        public static Equipment smokeGrenade = new Equipment("Smoke Grenade", "Grenade", 300);

        public static Equipment flashbang = new Equipment("Flashbang", "Grenade", 200);

        public static Equipment decoyGrenade = new Equipment("Decoy Grenade", "Grenade", 50);

        public static Equipment incendiary = new Equipment("Incendiary Grenade", "Grenade", 600);

        public static Equipment defusalKit = new Equipment("Defusal Kit", "Equipment", 400);

        
        /// <summary>
        /// Constructor for the Application object.
        /// </summary>
        public App()
        {
            // Global handler for uncaught exceptions.
            UnhandledException += Application_UnhandledException;

            // Standard XAML initialization
            InitializeComponent();



            // Phone-specific initialization
            InitializePhoneApplication();

            // Language display initialization
            InitializeLanguage();

            // Show graphics profiling information while debugging.
            if (Debugger.IsAttached)
            {
                // Display the current frame rate counters.
                Application.Current.Host.Settings.EnableFrameRateCounter = true;

                // Show the areas of the app that are being redrawn in each frame.
                //Application.Current.Host.Settings.EnableRedrawRegions = true;

                // Enable non-production analysis visualization mode,
                // which shows areas of a page that are handed off to GPU with a colored overlay.
                //Application.Current.Host.Settings.EnableCacheVisualization = true;

                // Prevent the screen from turning off while under the debugger by disabling
                // the application's idle detection.
                // Caution:- Use this under debug mode only. Application that disables user idle detection will continue to run
                // and consume battery power when the user is not using the phone.
                PhoneApplicationService.Current.UserIdleDetectionMode = IdleDetectionMode.Disabled;
            }

        }

        // Code to execute when the application is launching (eg, from Start)
        // This code will not execute when the application is reactivated
        private void Application_Launching(object sender, LaunchingEventArgs e)
        {
        }

        // Code to execute when the application is activated (brought to foreground)
        // This code will not execute when the application is first launched
        private void Application_Activated(object sender, ActivatedEventArgs e)
        {
        }

        // Code to execute when the application is deactivated (sent to background)
        // This code will not execute when the application is closing
        private void Application_Deactivated(object sender, DeactivatedEventArgs e)
        {
        }

        // Code to execute when the application is closing (eg, user hit Back)
        // This code will not execute when the application is deactivated
        private void Application_Closing(object sender, ClosingEventArgs e)
        {
        }

        // Code to execute if a navigation fails
        private void RootFrame_NavigationFailed(object sender, NavigationFailedEventArgs e)
        {
            if (Debugger.IsAttached)
            {
                // A navigation has failed; break into the debugger
                Debugger.Break();
            }
        }

        // Code to execute on Unhandled Exceptions
        private void Application_UnhandledException(object sender, ApplicationUnhandledExceptionEventArgs e)
        {
            if (Debugger.IsAttached)
            {
                // An unhandled exception has occurred; break into the debugger
                Debugger.Break();
            }
        }

        #region Phone application initialization

        // Avoid double-initialization
        private bool phoneApplicationInitialized = false;

        // Do not add any additional code to this method
        private void InitializePhoneApplication()
        {
            if (phoneApplicationInitialized)
                return;

            // Create the frame but don't set it as RootVisual yet; this allows the splash
            // screen to remain active until the application is ready to render.
            RootFrame = new PhoneApplicationFrame();
            RootFrame.Navigated += CompleteInitializePhoneApplication;

            // Handle navigation failures
            RootFrame.NavigationFailed += RootFrame_NavigationFailed;

            // Handle reset requests for clearing the backstack
            RootFrame.Navigated += CheckForResetNavigation;

            // Ensure we don't initialize again
            phoneApplicationInitialized = true;
        }

        // Do not add any additional code to this method
        private void CompleteInitializePhoneApplication(object sender, NavigationEventArgs e)
        {
            // Set the root visual to allow the application to render
            if (RootVisual != RootFrame)
                RootVisual = RootFrame;

            // Remove this handler since it is no longer needed
            RootFrame.Navigated -= CompleteInitializePhoneApplication;
        }

        private void CheckForResetNavigation(object sender, NavigationEventArgs e)
        {
            // If the app has received a 'reset' navigation, then we need to check
            // on the next navigation to see if the page stack should be reset
            if (e.NavigationMode == NavigationMode.Reset)
                RootFrame.Navigated += ClearBackStackAfterReset;
        }

        private void ClearBackStackAfterReset(object sender, NavigationEventArgs e)
        {
            // Unregister the event so it doesn't get called again
            RootFrame.Navigated -= ClearBackStackAfterReset;

            // Only clear the stack for 'new' (forward) and 'refresh' navigations
            if (e.NavigationMode != NavigationMode.New && e.NavigationMode != NavigationMode.Refresh)
                return;

            // For UI consistency, clear the entire page stack
            while (RootFrame.RemoveBackEntry() != null)
            {
                ; // do nothing
            }
        }

        #endregion

        // Initialize the app's font and flow direction as defined in its localized resource strings.
        //
        // To ensure that the font of your application is aligned with its supported languages and that the
        // FlowDirection for each of those languages follows its traditional direction, ResourceLanguage
        // and ResourceFlowDirection should be initialized in each resx file to match these values with that
        // file's culture. For example:
        //
        // AppResources.es-ES.resx
        //    ResourceLanguage's value should be "es-ES"
        //    ResourceFlowDirection's value should be "LeftToRight"
        //
        // AppResources.ar-SA.resx
        //     ResourceLanguage's value should be "ar-SA"
        //     ResourceFlowDirection's value should be "RightToLeft"
        //
        // For more info on localizing Windows Phone apps see http://go.microsoft.com/fwlink/?LinkId=262072.
        //
        private void InitializeLanguage()
        {
            try
            {
                // Set the font to match the display language defined by the
                // ResourceLanguage resource string for each supported language.
                //
                // Fall back to the font of the neutral language if the Display
                // language of the phone is not supported.
                //
                // If a compiler error is hit then ResourceLanguage is missing from
                // the resource file.
                RootFrame.Language = XmlLanguage.GetLanguage(AppResources.ResourceLanguage);

                // Set the FlowDirection of all elements under the root frame based
                // on the ResourceFlowDirection resource string for each
                // supported language.
                //
                // If a compiler error is hit then ResourceFlowDirection is missing from
                // the resource file.
                FlowDirection flow = (FlowDirection)Enum.Parse(typeof(FlowDirection), AppResources.ResourceFlowDirection);
                RootFrame.FlowDirection = flow;
            }
            catch
            {
                // If an exception is caught here it is most likely due to either
                // ResourceLangauge not being correctly set to a supported language
                // code or ResourceFlowDirection is set to a value other than LeftToRight
                // or RightToLeft.

                if (Debugger.IsAttached)
                {
                    Debugger.Break();
                }

                throw;
            }
        }
    }
}