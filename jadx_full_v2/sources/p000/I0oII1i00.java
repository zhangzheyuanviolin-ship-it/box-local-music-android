            package p000;

            import java.io.File;
            import java.util.ArrayList;
            
            public final class I0oII1i00 implements IliO010iiOOI {
                public final int I00iOIl;

                @Override
                public ArrayList I00000oOI() {
                    String[] strArr;
/* 3 */             ArrayList arrayList = new ArrayList();
                    switch (this.I00iOIl) {
                        case 0:
/* 105 */                   strArr = new String[]{"/system/fonts"};
                            break;
                        case 1:
/* 98 */                    strArr = new String[]{System.getProperty("user.home") + "/Library/Fonts/", "/Library/Fonts/", "/System/Library/Fonts/", "/Network/Library/Fonts/"};
                            break;
                        case 2:
/* 68 */                    strArr = new String[]{System.getProperty("user.home") + "/.fonts", "/QIBM/ProdData/OS400/Fonts"};
                            break;
                        default:
/* 42 */                    strArr = new String[]{System.getProperty("user.home") + "/.fonts", "/usr/local/fonts", "/usr/local/share/fonts", "/usr/share/fonts", "/usr/X11R6/lib/X11/fonts"};
                            break;
                    }
/* 111 */           for (String str : strArr) {
/* 117 */               File file = new File(str);
                        try {
/* 124 */                   if (file.exists() && file.canRead()) {
/* 132 */                       arrayList.add(file);
                            }
                        } catch (SecurityException unused) {
                        }
                    }
/* 138 */           return arrayList;
                }
            }
