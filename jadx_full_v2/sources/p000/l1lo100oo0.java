            package p000;

            import android.net.Uri;
            import android.os.Bundle;
            import android.text.TextUtils;
            import android.util.Pair;
            
            public final class l1lo100oo0 implements Runnable {
                public final int I00iOIl;
                public lIl1O1li I00iiI;

                public l1lo100oo0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() {
                    switch (this.I00iOIl) {
                        case 0:
/* 322 */                   this.I00iiI.I011lO1liO1O();
                            break;
                        case 1:
/* 103 */                   iili011O1 iili011o1 = this.I00iiI.I00o101lO;
/* 107 */                   l0olllO1i l0olllo1i = (l0olllO1i) iili011o1.I00iiI;
/* 109 */                   l0o10OoO0 l0o10ooo0 = l0olllo1i.I00io1l;
/* 111 */                   lIl1O1li lil1o1li = l0olllo1i.I00lli11;
/* 113 */                   l0Oi0o l0oi0o = l0olllo1i.I00ilI0I1;
/* 115 */                   l0olllO1i.I000II(l0o10ooo0);
/* 118 */                   l0o10ooo0.I010II();
/* 125 */                   if (iili011o1.I0000Il00O()) {
/* 136 */                       if (iili011o1.I00000oOI()) {
/* 138 */                           l0olllO1i.I0000oI00(l0oi0o);
/* 143 */                           l0oi0o.I00ol1.I000O01llI0(null);
/* 148 */                           Bundle bundle = new Bundle();
/* 155 */                           bundle.putString("source", "(not set)");
/* 160 */                           bundle.putString("medium", "(not set)");
/* 167 */                           bundle.putString("_cis", "intent");
/* 170 */                           bundle.putLong("_cc", 1L);
/* 173 */                           l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 180 */                           lil1o1li.I010l1ol111("auto", "_cmpx", bundle);
                                } else {
/* 185 */                           l0olllO1i.I0000oI00(l0oi0o);
/* 188 */                           I1ii1l10IO i1ii1l10IO = l0oi0o.I00ol1;
/* 190 */                           String strI000II = i1ii1l10IO.I000II();
/* 198 */                           if (TextUtils.isEmpty(strI000II)) {
/* 200 */                               l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 202 */                               l0olllO1i.I000II(l01o0io1ooo0);
/* 209 */                               l01o0io1ooo0.I00io1l.I00000oOI("Cache still valid but referrer not found");
                                    } else {
/* 219 */                               long j = 3600000;
/* 222 */                               long jI00000oIO = l0oi0o.I00olI.I00000oIO() / 3600000;
/* 223 */                               Uri uri = Uri.parse(strI000II);
/* 229 */                               Bundle bundle2 = new Bundle();
/* 238 */                               Pair pair = new Pair(uri.getPath(), bundle2);
/* 253 */                               for (String str : uri.getQueryParameterNames()) {
/* 267 */                                   bundle2.putString(str, uri.getQueryParameter(str));
/* 270 */                                   j = j;
                                        }
/* 284 */                               ((Bundle) pair.second).putLong("_cc", (jI00000oIO - 1) * j);
/* 287 */                               Object obj = pair.first;
/* 294 */                               String str2 = obj == null ? "app" : (String) obj;
/* 296 */                               l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 305 */                               lil1o1li.I010l1ol111(str2, "_cmp", (Bundle) pair.second);
                                    }
/* 308 */                           i1ii1l10IO.I000O01llI0(null);
                                }
/* 311 */                       l0olllO1i.I0000oI00(l0oi0o);
/* 316 */                       l0oi0o.I00olI.I00000oOI(0L);
                                break;
                            }
                            break;
                        case 2:
/* 18 */                    lIl1O1li lil1o1li2 = this.I00iiI;
/* 20 */                    lil1o1li2.I010II();
/* 25 */                    l0olllO1i l0olllo1i2 = (l0olllO1i) lil1o1li2.I00iOIl;
/* 27 */                    l0Oi0o l0oi0o2 = l0olllo1i2.I00ilI0I1;
/* 29 */                    l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i2.I00ilO0;
/* 31 */                    l0olllO1i.I0000oI00(l0oi0o2);
/* 34 */                    l0IllIiO l0illiio = l0oi0o2.I00oIiI10;
/* 40 */                    if (l0illiio.I00000oIO()) {
/* 90 */                        l0olllO1i.I000II(l01o0io1ooo02);
/* 97 */                        l01o0io1ooo02.I00lli11.I00000oOI("Deferred Deep Link already retrieved. Not fetching again.");
                                break;
                            } else {
/* 42 */                        l0O0o010I l0o0o010i = l0oi0o2.I00oO101o;
/* 44 */                        long jI00000oIO2 = l0o0o010i.I00000oIO();
/* 49 */                        l0o0o010i.I00000oOI(1 + jI00000oIO2);
/* 56 */                        if (jI00000oIO2 >= 5) {
/* 58 */                            l0olllO1i.I000II(l01o0io1ooo02);
/* 65 */                            l01o0io1ooo02.I00l0I0l0lO1.I00000oOI("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
/* 69 */                            l0illiio.I00000oOI(true);
                                    break;
                                } else {
/* 73 */                            l1o00OIlII l1o00oilii = lil1o1li2.I00oII;
/* 75 */                            if (l1o00oilii == null) {
/* 81 */                                l1o00oilii = new l1o00OIlII(lil1o1li2, l0olllo1i2, 3, false);
/* 84 */                                lil1o1li2.I00oII = l1o00oilii;
                                    }
/* 86 */                            l1o00oilii.I00000oOI(0L);
                                    break;
                                }
                            }
                        default:
/* 14 */                    this.I00iiI.I011lO1liO1O();
                            break;
                    }
                }
            }
