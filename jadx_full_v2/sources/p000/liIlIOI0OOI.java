            package p000;

            import java.io.File;
            
            public abstract class liIlIOI0OOI {
                public static String I00000oIO(File file) {
/* 11 */            if (file.getName().endsWith(".apk")) {
/* 21 */                String strReplaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", "");
                        return (strReplaceFirst.equals("base-master") || strReplaceFirst.equals("base-main")) ? "" : strReplaceFirst.startsWith("base-") ? strReplaceFirst.replace("base-", "config.") : strReplaceFirst.replace("-", ".config.").replace(".config.master", "").replace(".config.main", "");
                    }
/* 81 */            I000II.I000iOII("Non-apk found in splits directory.");
/* 84 */            return null;
                }
            }
