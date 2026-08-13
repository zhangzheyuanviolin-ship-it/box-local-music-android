            package p000;

            import java.util.HashMap;
            
            public abstract class i0I1iii0l0l {
                public static final HashMap I00000oIO;
                public static final HashMap I00000oOI;

                static {
/* 3 */             HashMap map = new HashMap();
/* 6 */             I00000oIO = map;
/* 10 */            HashMap map2 = new HashMap();
/* 13 */            I00000oOI = map2;
/* 22 */            map.put(-1, "The requesting app is unavailable (e.g. unpublished, nonexistent version code).");
/* 32 */            map.put(-2, "The requested pack is not available.");
/* 42 */            map.put(-3, "The request is invalid.");
/* 52 */            map.put(-4, "The requested download is not found.");
/* 62 */            map.put(-5, "The Asset Delivery API is not available.");
/* 72 */            map.put(-6, "Network error. Unable to obtain the asset pack details.");
/* 82 */            map.put(-7, "Download not permitted under current device circumstances (e.g. in background).");
/* 93 */            map.put(-10, "Asset pack download failed due to insufficient storage.");
/* 104 */           map.put(-11, "The Play Store app is either not installed or not the official version.");
/* 115 */           map.put(-12, "Tried to show the cellular data confirmation but no asset packs are waiting for Wi-Fi.");
/* 126 */           map.put(-13, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.");
/* 137 */           map.put(-14, "Tried to show the confirmation dialog but no asset packs are waiting for user confirmation.");
/* 142 */           map.put(-14, "The installed app version was not installed by Play.");
/* 153 */           map.put(-100, "Unknown error downloading an asset pack.");
/* 158 */           map2.put(-1, "APP_UNAVAILABLE");
/* 163 */           map2.put(-2, "PACK_UNAVAILABLE");
/* 168 */           map2.put(-3, "INVALID_REQUEST");
/* 173 */           map2.put(-4, "DOWNLOAD_NOT_FOUND");
/* 178 */           map2.put(-5, "API_NOT_AVAILABLE");
/* 183 */           map2.put(-6, "NETWORK_ERROR");
/* 188 */           map2.put(-7, "ACCESS_DENIED");
/* 193 */           map2.put(-10, "INSUFFICIENT_STORAGE");
/* 198 */           map2.put(-11, "PLAY_STORE_NOT_FOUND");
/* 203 */           map2.put(-12, "NETWORK_UNRESTRICTED");
/* 208 */           map2.put(-13, "APP_NOT_OWNED");
/* 213 */           map2.put(-14, "CONFIRMATION_NOT_REQUIRED");
/* 224 */           map2.put(-15, "UNRECOGNIZED_INSTALLATION");
/* 229 */           map2.put(-100, "INTERNAL_ERROR");
                }
            }
