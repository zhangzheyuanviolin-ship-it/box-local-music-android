            package p000;

            import android.os.Bundle;
            import android.os.RemoteException;
            import android.text.TextUtils;
            import java.util.Collections;
            import java.util.List;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class lO0oOoOoIOo implements Runnable {
                public final int I00iOIl;
                public String I00iiI;
                public String I00iiO;
                public lli10iI I00iio;
                public boolean I00ilI0I1;
                public lOliOlO1Io I00ilO0;
                public Object I00io1l;

                public lO0oOoOoIOo(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() throws Throwable {
                    lioil0ilIOi lioil0ilioi;
                    iolll0ill1i iolll0ill1iVar;
                    AtomicReference atomicReference;
                    lOliOlO1Io loliolo1io;
                    iolll0ill1i iolll0ill1iVar2;
                    switch (this.I00iOIl) {
                        case 0:
/* 146 */                   String str = this.I00iiO;
/* 148 */                   String str2 = this.I00iiI;
/* 152 */                   il0IOO il0ioo = (il0IOO) this.I00io1l;
/* 154 */                   lOliOlO1Io loliolo1io2 = this.I00ilO0;
/* 158 */                   l0olllO1i l0olllo1i = (l0olllO1i) loliolo1io2.I00iOIl;
/* 162 */                   Bundle bundle = new Bundle();
                            try {
                                try {
/* 165 */                           iolll0ill1iVar = loliolo1io2.I00iio;
                                } catch (RemoteException e) {
/* 194 */                           e = e;
                                }
/* 167 */                       if (iolll0ill1iVar == null) {
/* 169 */                           l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 171 */                           l0olllO1i.I000II(l01o0io1ooo0);
/* 178 */                           l01o0io1ooo0.I00ilO0.I0000O(str2, "Failed to get user properties; not connected to service", str);
/* 181 */                           lioil0ilioi = l0olllo1i.I00l0I0l0lO1;
/* 183 */                           l0olllO1i.I0000oI00(lioil0ilioi);
/* 186 */                           lioil0ilioi.I01Io1ilOIIo(il0ioo, bundle);
/* 294 */                           return;
                                }
/* 200 */                       List<lio0llOI0> listI00Io1o110i = iolll0ill1iVar.I00Io1o110i(str2, str, this.I00ilI0I1, this.I00iio);
/* 206 */                       Bundle bundle2 = new Bundle();
/* 209 */                       if (listI00Io1o110i != null) {
/* 220 */                           for (lio0llOI0 lio0lloi0 : listI00Io1o110i) {
/* 228 */                               String str3 = lio0lloi0.I00ilI0I1;
/* 230 */                               String str4 = lio0lloi0.I00iiI;
/* 232 */                               if (str3 != null) {
/* 234 */                                   bundle2.putString(str4, str3);
                                        } else {
/* 238 */                                   Long l = lio0lloi0.I00iio;
/* 240 */                                   if (l != null) {
/* 246 */                                       bundle2.putLong(str4, l.longValue());
                                            } else {
/* 250 */                                       Double d = lio0lloi0.I00io1l;
/* 252 */                                       if (d != null) {
/* 258 */                                           bundle2.putDouble(str4, d.doubleValue());
                                                }
                                            }
                                        }
                                    }
                                }
                                try {
/* 262 */                           loliolo1io2.I0110OiO();
/* 265 */                           lioil0ilIOi lioil0ilioi2 = l0olllo1i.I00l0I0l0lO1;
/* 267 */                           l0olllO1i.I0000oI00(lioil0ilioi2);
/* 270 */                           lioil0ilioi2.I01Io1ilOIIo(il0ioo, bundle2);
/* 294 */                           return;
                                } catch (RemoteException e2) {
/* 277 */                           e = e2;
/* 278 */                           bundle = bundle2;
/* 279 */                           l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 281 */                           l0olllO1i.I000II(l01o0io1ooo02);
/* 288 */                           l01o0io1ooo02.I00ilO0.I0000O(str2, "Failed to get user properties; remote exception", e);
/* 291 */                           lioil0ilioi = l0olllo1i.I00l0I0l0lO1;
/* 183 */                           l0olllO1i.I0000oI00(lioil0ilioi);
/* 186 */                           lioil0ilioi.I01Io1ilOIIo(il0ioo, bundle);
/* 294 */                           return;
                                } catch (Throwable th) {
/* 274 */                           th = th;
/* 275 */                           bundle = bundle2;
/* 295 */                           lioil0ilIOi lioil0ilioi3 = l0olllo1i.I00l0I0l0lO1;
/* 297 */                           l0olllO1i.I0000oI00(lioil0ilioi3);
/* 300 */                           lioil0ilioi3.I01Io1ilOIIo(il0ioo, bundle);
/* 303 */                           throw th;
                                }
                            } catch (Throwable th2) {
/* 191 */                       th = th2;
                            }
                        default:
/* 8 */                     AtomicReference atomicReference2 = (AtomicReference) this.I00io1l;
                            synchronized (atomicReference2) {
                                try {
                                    try {
/* 12 */                                loliolo1io = this.I00ilO0;
/* 14 */                                iolll0ill1iVar2 = loliolo1io.I00iio;
                                    } catch (RemoteException e3) {
/* 106 */                               l01O0IO1ooO0 l01o0io1ooo03 = ((l0olllO1i) this.I00ilO0.I00iOIl).I00ilO0;
/* 108 */                               l0olllO1i.I000II(l01o0io1ooo03);
/* 117 */                               l01o0io1ooo03.I00ilO0.I0000oI00("(legacy) Failed to get user properties; remote exception", null, this.I00iiI, e3);
/* 126 */                               ((AtomicReference) this.I00io1l).set(Collections.EMPTY_LIST);
/* 131 */                               atomicReference = (AtomicReference) this.I00io1l;
                                    }
/* 16 */                            if (iolll0ill1iVar2 == null) {
/* 22 */                                l01O0IO1ooO0 l01o0io1ooo04 = ((l0olllO1i) loliolo1io.I00iOIl).I00ilO0;
/* 24 */                                l0olllO1i.I000II(l01o0io1ooo04);
/* 35 */                                l01o0io1ooo04.I00ilO0.I0000oI00("(legacy) Failed to get user properties; not connected to service", null, this.I00iiI, this.I00iiO);
/* 40 */                                atomicReference2.set(Collections.EMPTY_LIST);
/* 43 */                                atomicReference2.notify();
/* 135 */                               return;
                                    }
/* 58 */                            if (TextUtils.isEmpty(null)) {
/* 72 */                                atomicReference2.set(iolll0ill1iVar2.I00Io1o110i(this.I00iiI, this.I00iiO, this.I00ilI0I1, this.I00iio));
                                    } else {
/* 86 */                                atomicReference2.set(iolll0ill1iVar2.I0001Ioi1lo(null, this.I00iiI, this.I00iiO, this.I00ilI0I1));
                                    }
/* 89 */                            loliolo1io.I0110OiO();
/* 94 */                            atomicReference = (AtomicReference) this.I00io1l;
/* 96 */                            atomicReference.notify();
/* 135 */                           return;
                                } catch (Throwable th3) {
/* 140 */                           ((AtomicReference) this.I00io1l).notify();
/* 143 */                           throw th3;
                                }
                            }
                    }
                }
            }
