            package p000;

            import android.os.SystemClock;
            import android.text.TextUtils;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.atomic.AtomicReference;
            import org.json.JSONException;
            
            public final class l1ooOIo implements Runnable {
                public final int I00iOIl;
                public long I00iiI;
                public lIl1O1li I00iiO;

                public l1ooOIo(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() throws JSONException {
                    switch (this.I00iOIl) {
                        case 0:
/* 231 */                   l0olllO1i l0olllo1i = (l0olllO1i) this.I00iiO.I00iOIl;
/* 233 */                   l0Oi0o l0oi0o = l0olllo1i.I00ilI0I1;
/* 235 */                   l0olllO1i.I0000oI00(l0oi0o);
/* 238 */                   l0O0o010I l0o0o010i = l0oi0o.I00li1OI;
/* 240 */                   long j = this.I00iiI;
/* 242 */                   l0o0o010i.I00000oOI(j);
/* 245 */                   l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 247 */                   l0olllO1i.I000II(l01o0io1ooo0);
/* 258 */                   l01o0io1ooo0.I00lli11.I0000Il00O("Session timeout duration set", Long.valueOf(j));
                            break;
                        default:
/* 6 */                     lIl1O1li lil1o1li = this.I00iiO;
/* 8 */                     lil1o1li.I010II();
/* 11 */                    lil1o1li.I010OIo1l();
/* 16 */                    l0olllO1i l0olllo1i2 = (l0olllO1i) lil1o1li.I00iOIl;
/* 18 */                    l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i2.I00ilO0;
/* 20 */                    l0olllO1i.I000II(l01o0io1ooo02);
/* 27 */                    l01o0io1ooo02.I00lli11.I00000oOI("Resetting analytics data (FE)");
/* 30 */                    li10O1l0 li10o1l0 = l0olllo1i2.I00ioIO;
/* 32 */                    l0olllO1i.I0001Ioi1lo(li10o1l0);
/* 35 */                    li10o1l0.I010II();
/* 38 */                    OooI11loO0I oooI11loO0I = li10o1l0.I00ilO0;
/* 44 */                    ((li0O100iO01) oooI11loO0I.I00iiO).I0000Il00O();
/* 57 */                    ((l0olllO1i) ((li10O1l0) oooI11loO0I.I00iio).I00iOIl).I00li1OI.getClass();
/* 60 */                    long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 64 */                    oooI11loO0I.I00iOIl = jElapsedRealtime;
/* 66 */                    oooI11loO0I.I00iiI = jElapsedRealtime;
/* 72 */                    l0olllo1i2.I000iOII().I010l10O();
                            boolean z = !l0olllo1i2.I00000oIO();
/* 81 */                    l0Oi0o l0oi0o2 = l0olllo1i2.I00ilI0I1;
/* 83 */                    l0olllO1i.I0000oI00(l0oi0o2);
/* 90 */                    l0oi0o2.I00ilO0.I00000oOI(this.I00iiI);
/* 95 */                    l0olllO1i l0olllo1i3 = (l0olllO1i) l0oi0o2.I00iOIl;
/* 97 */                    l0Oi0o l0oi0o3 = l0olllo1i3.I00ilI0I1;
/* 99 */                    l0olllO1i.I0000oI00(l0oi0o3);
/* 113 */                   if (!TextUtils.isEmpty(l0oi0o3.I00oOio10iI1.I000II())) {
/* 117 */                       l0oi0o2.I00oOio10iI1.I000O01llI0(null);
                            }
/* 124 */                   l0oi0o2.I00o0l1o1o0.I00000oOI(0L);
/* 129 */                   l0oi0o2.I00o101lO.I00000oOI(0L);
/* 138 */                   if (!l0olllo1i3.I00iio.I0110o()) {
/* 140 */                       l0oi0o2.I010lI0oi(z);
                            }
/* 145 */                   l0oi0o2.I00ol1.I000O01llI0(null);
/* 150 */                   l0oi0o2.I00olI.I00000oOI(0L);
/* 155 */                   l0oi0o2.I00oli.I001IIilI0O(null);
/* 158 */                   lOliOlO1Io loliolo1ioI000OOo1O = l0olllo1i2.I000OOo1O();
/* 162 */                   loliolo1ioI000OOo1O.I010II();
/* 165 */                   loliolo1ioI000OOo1O.I010OIo1l();
/* 169 */                   lli10iI lli10iiI011IO1I11OI = loliolo1ioI000OOo1O.I011IO1I11OI(false);
/* 173 */                   loliolo1ioI000OOo1O.I01101olii();
/* 184 */                   ((l0olllO1i) loliolo1ioI000OOo1O.I00iOIl).I000O01llI0().I010ioo();
/* 191 */                   iooiio1i0 iooiio1i0Var = new iooiio1i0(11);
/* 194 */                   iooiio1i0Var.I00iiI = lli10iiI011IO1I11OI;
/* 196 */                   iooiio1i0Var.I00iiO = loliolo1ioI000OOo1O;
/* 198 */                   VarHandle.storeStoreFence();
/* 201 */                   loliolo1ioI000OOo1O.I0110o(iooiio1i0Var);
/* 204 */                   l0olllO1i.I0001Ioi1lo(li10o1l0);
/* 209 */                   li10o1l0.I00ilI0I1.I00000oOI();
/* 212 */                   lil1o1li.I00oI0i = z;
/* 223 */                   l0olllo1i2.I000OOo1O().I010ioo(new AtomicReference());
                            break;
                    }
                }
            }
