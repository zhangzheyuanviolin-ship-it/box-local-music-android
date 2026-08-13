            package p000;

            import android.net.Uri;
            import android.os.StrictMode;
            import android.util.Log;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            
            public final class lii0l0 implements IllOoOoo {
                public final int I00iOIl;
                public Object I00iiI;

                public lii0l0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object apply(Object obj) {
                    int i;
                    switch (this.I00iOIl) {
                        case 0:
/* 264 */                   Log.w("FlagStore", "Failed to commit to updated flags for ".concat(String.valueOf(((lili0I0IOO0) this.I00iiI).I0000Il00O)), (Throwable) obj);
/* 3 */                     return null;
                        case 1:
/* 149 */                   lOoo0oiii looo0oiii = (lOoo0oiii) obj;
/* 151 */                   o00o0o1 o00o0o1Var = ll0I0liIiiI.I00000oIO;
/* 155 */                   String str = (String) this.I00iiI;
/* 169 */                   lOoIIiI looiiii = (lOoIIiI) looo0oiii.I00111O(str, lOoOO01iIO1.I001IIilI0O()).I000OiO();
/* 189 */                   if (!Collections.unmodifiableList(((lOoOO01iIO1) looiiii.I00iiI).I00111O()).contains("")) {
/* 191 */                       looiiii.I0000Il00O();
/* 198 */                       ((lOoOO01iIO1) looiiii.I00iiI).I001IO000("");
                            }
/* 205 */                   lOolOO looloo = (lOolOO) looo0oiii.I000OiO();
/* 207 */                   looiiii.I0000Il00O();
/* 214 */                   ((lOoOO01iIO1) looiiii.I00iiI).I001i1O0Ol("");
/* 221 */                   lOoOO01iIO1 loooo01iio1 = (lOoOO01iIO1) looiiii.I0000oI00();
/* 223 */                   looloo.I0000Il00O();
/* 234 */                   ((lOoo0oiii) looloo.I00iiI).I001IO000().put(str, loooo01iio1);
/* 241 */                   return (lOoo0oiii) looloo.I0000oI00();
                        default:
/* 9 */                     llilooO llilooo = (llilooO) this.I00iiI;
/* 11 */                    lOo0ll1 loo0ll1 = (lOo0ll1) obj;
/* 17 */                    OoOlO1O0o ooOlO1O0o = new OoOlO1O0o(13);
/* 20 */                    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
/* 37 */                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskWrites().build());
                            try {
                                try {
                                    synchronized (llilooO.I000OiO) {
/* 49 */                                lloOo1iol llooo1iol = (lloOo1iol) llilooo.I0000O.get();
/* 51 */                                Uri uri = llilooo.I000II;
/* 53 */                                lOlIllO1 lolillo1I00111O = loo0ll1.I00111O();
/* 59 */                                i = 12;
/* 61 */                                i000IO i000io = new i000IO(i);
/* 64 */                                i000io.I00iiI = lolillo1I00111O;
/* 66 */                                VarHandle.storeStoreFence();
/* 73 */                                i000io.I00iiO = new OoOlO1O0o[]{ooOlO1O0o};
/* 75 */                                llooo1iol.I00000oIO(uri, i000io);
/* 82 */                                llilooo.I000O01llI0 = loo0ll1.I00111O();
                                    }
                                    synchronized (llilooO.I000iOII) {
/* 94 */                                lloOo1iol llooo1iol2 = (lloOo1iol) llilooo.I0000O.get();
/* 96 */                                Uri uri2 = llilooo.I000OOo1O;
/* 98 */                                lOliIOo1 loliioo1I001IIilI0O = loo0ll1.I001IIilI0O();
/* 104 */                               i000IO i000io2 = new i000IO(i);
/* 107 */                               i000io2.I00iiI = loliioo1I001IIilI0O;
/* 109 */                               VarHandle.storeStoreFence();
/* 116 */                               i000io2.I00iiO = new OoOlO1O0o[]{ooOlO1O0o};
/* 118 */                               llooo1iol2.I00000oIO(uri2, i000io2);
/* 121 */                               loo0ll1.I001IIilI0O();
                                    }
/* 3 */                             return null;
                                } catch (IOException e) {
/* 144 */                           throw new RuntimeException(e);
                                }
                            } finally {
/* 145 */                       StrictMode.setThreadPolicy(threadPolicy);
                            }
                    }
                }
            }
