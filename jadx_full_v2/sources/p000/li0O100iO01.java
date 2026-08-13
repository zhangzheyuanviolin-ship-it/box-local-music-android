            package p000;

            import android.app.BroadcastOptions;
            import android.content.Intent;
            import android.os.SystemClock;
            
            public final class li0O100iO01 extends iOo0iOlili1 {
                public final int I0000oI00;
                public final Object I0001Ioi1lo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public li0O100iO01(Object obj, l1i11I1I0 l1i11i1i0, int i) {
/* 5 */             super(l1i11i1i0);
/* 1 */             this.I0000oI00 = i;
/* 3 */             this.I0001Ioi1lo = obj;
                }

                @Override
                public final void I00000oIO() {
/* 1 */             int i = this.I0000oI00;
/* 3 */             Object obj = this.I0001Ioi1lo;
                    switch (i) {
                        case 0:
/* 116 */                   OooI11loO0I oooI11loO0I = (OooI11loO0I) obj;
/* 120 */                   li10O1l0 li10o1l0 = (li10O1l0) oooI11loO0I.I00iio;
/* 122 */                   li10o1l0.I010II();
/* 127 */                   l0olllO1i l0olllo1i = (l0olllO1i) li10o1l0.I00iOIl;
/* 131 */                   l0olllo1i.I00li1OI.getClass();
/* 139 */                   oooI11loO0I.I0000oI00(SystemClock.elapsedRealtime(), false, false);
/* 142 */                   il11ll0i il11ll0iVar = l0olllo1i.I00lll10;
/* 144 */                   l0olllO1i.I0000O(il11ll0iVar);
/* 149 */                   l0olllo1i.I00li1OI.getClass();
/* 156 */                   il11ll0iVar.I010iIIOlo(SystemClock.elapsedRealtime());
                            break;
                        case 1:
/* 89 */                    liI1IolOl lii1iolol = (liI1IolOl) obj;
/* 91 */                    lii1iolol.I010ioo();
/* 98 */                    l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) lii1iolol.I00iOIl).I00ilO0;
/* 100 */                   l0olllO1i.I000II(l01o0io1ooo0);
/* 107 */                   l01o0io1ooo0.I00lll10.I00000oOI("Starting upload from DelayedRunnable");
/* 112 */                   lii1iolol.I00iiI.I000l1();
                            break;
                        default:
/* 8 */                     lilOOl0 lilool0 = (lilOOl0) obj;
/* 14 */                    lilool0.I00iOIl().I010II();
/* 23 */                    String str = (String) lilool0.I00o101lO.pollFirst();
/* 25 */                    if (str != null) {
/* 31 */                        lilool0.I00IoO0().getClass();
/* 38 */                        lilool0.I010II = SystemClock.elapsedRealtime();
/* 48 */                        lilool0.I00II0oii1o().I00lll10.I0000Il00O("Sending trigger URI notification to app", str);
/* 53 */                        Intent intent = new Intent();
/* 58 */                        intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
/* 61 */                        intent.setPackage(str);
/* 82 */                        lilool0.I00ll1.I00iOIl.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                            }
/* 85 */                    lilool0.I00II0Ol1O0l();
                            break;
                    }
                }
            }
