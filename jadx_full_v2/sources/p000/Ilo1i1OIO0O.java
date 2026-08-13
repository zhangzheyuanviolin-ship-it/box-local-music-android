            package p000;

            import android.webkit.ConsoleMessage;
            import android.webkit.PermissionRequest;
            import android.webkit.WebChromeClient;
            import java.util.ArrayList;
            import kotlin.jvm.functions.Function1;
            
            public final class Ilo1i1OIO0O extends WebChromeClient {
                public final Function1 I00000oIO;
                public final boolean I00000oOI;
                public final O1OIi1 I0000Il00O;
                public final O1OIi1 I0000O;
                public final OI10i0Il I0000oI00;
                public final OI10i0Il I0001Ioi1lo;

                public Ilo1i1OIO0O(Function1 function1, boolean z, O1OIi1 o1OIi1, O1OIi1 o1OIi12, OI10i0Il oI10i0Il, OI10i0Il oI10i0Il2) {
/* 1 */             this.I00000oIO = function1;
/* 3 */             this.I00000oOI = z;
/* 5 */             this.I0000Il00O = o1OIi1;
/* 7 */             this.I0000O = o1OIi12;
/* 9 */             this.I0000oI00 = oI10i0Il;
/* 11 */            this.I0001Ioi1lo = oI10i0Il2;
                }

                @Override
                public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
/* 1 */             if (consoleMessage != null) {
/* 3 */                 consoleMessage.message();
                    }
/* 6 */             if (consoleMessage != null) {
/* 8 */                 consoleMessage.lineNumber();
                    }
/* 11 */            if (consoleMessage != null) {
/* 13 */                consoleMessage.sourceId();
                    }
/* 16 */            Function1 function1 = this.I00000oIO;
/* 18 */            if (function1 != null) {
/* 20 */                function1.invoke(consoleMessage);
                    }
/* 23 */            return super.onConsoleMessage(consoleMessage);
                }

                @Override
                public final void onPermissionRequest(PermissionRequest permissionRequest) throws Exception {
                    boolean z;
                    boolean z2;
/* 3 */             if (!this.I00000oOI) {
/* 5 */                 if (permissionRequest != null) {
/* 7 */                     permissionRequest.deny();
/* 10 */                    return;
                        }
/* 128 */               return;
                    }
/* 11 */            if (permissionRequest == null) {
/* 128 */               return;
                    }
/* 15 */            String[] resources = permissionRequest.getResources();
/* 19 */            int length = resources.length;
/* 21 */            int i = 0;
                    while (true) {
/* 24 */                z = true;
/* 25 */                if (i >= length) {
/* 40 */                    z2 = false;
                            break;
                        } else {
/* 33 */                    if (O0000Ioio00.I0000O(resources[i], "android.webkit.resource.VIDEO_CAPTURE")) {
/* 35 */                        z2 = true;
                                break;
                            }
/* 37 */                    i++;
                        }
                    }
/* 41 */            int length2 = resources.length;
/* 42 */            int i2 = 0;
                    while (true) {
/* 45 */                if (i2 >= length2) {
/* 59 */                    z = false;
                            break;
                        } else if (O0000Ioio00.I0000O(resources[i2], "android.webkit.resource.AUDIO_CAPTURE")) {
                            break;
                        } else {
/* 56 */                    i2++;
                        }
                    }
/* 60 */            if (z2) {
/* 64 */                this.I0000oI00.setValue(permissionRequest);
/* 71 */                this.I0000Il00O.I00000oIO("android.permission.CAMERA");
                    }
/* 74 */            if (z) {
/* 78 */                this.I0001Ioi1lo.setValue(permissionRequest);
/* 85 */                this.I0000O.I00000oIO("android.permission.RECORD_AUDIO");
                    }
/* 90 */            ArrayList arrayList = new ArrayList();
/* 95 */            for (String str : resources) {
/* 103 */               if (!O0000Ioio00.I0000O(str, "android.webkit.resource.VIDEO_CAPTURE") && !O0000Ioio00.I0000O(str, "android.webkit.resource.AUDIO_CAPTURE")) {
/* 111 */                   arrayList.add(str);
                        }
                    }
/* 123 */           String[] strArr = (String[]) arrayList.toArray(new String[0]);
/* 126 */           if (strArr.length == 0) {
/* 128 */               return;
                    }
/* 129 */           permissionRequest.grant(strArr);
                }
            }
