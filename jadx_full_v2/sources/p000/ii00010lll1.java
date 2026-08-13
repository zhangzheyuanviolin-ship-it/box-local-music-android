            package p000;

            import android.os.Bundle;
            import android.text.TextUtils;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            
            public final class ii00010lll1 {
                public String I00000oIO;
                public String I00000oOI;
                public String I0000Il00O;
                public long I0000O;
                public long I0000oI00;
                public long I0001Ioi1lo;
                public ii0il0lOolIo I000II;

                public ii00010lll1(l0olllO1i l0olllo1i, String str, String str2, String str3, long j, long j2, long j3, Bundle bundle) {
                    ii0il0lOolIo ii0il0loolio;
/* 4 */             lII0I0I000I.I0000O(str2);
/* 7 */             lII0I0I000I.I0000O(str3);
/* 10 */            this.I00000oIO = str2;
/* 12 */            this.I00000oOI = str3;
/* 22 */            this.I0000Il00O = true == TextUtils.isEmpty(str) ? null : str;
/* 24 */            this.I0000O = j;
/* 26 */            this.I0000oI00 = j2;
/* 28 */            this.I0001Ioi1lo = j3;
/* 34 */            if (j3 != 0 && j3 > j) {
/* 40 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 42 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 53 */                l01o0io1ooo0.I00l0I0l0lO1.I0000Il00O("Event created with reverse previous/current timestamps. appId", l01O0IO1ooO0.I010ioo(str2));
                    }
/* 56 */            if (bundle == null || bundle.isEmpty()) {
/* 166 */               ii0il0loolio = new ii0il0lOolIo(new Bundle());
                    } else {
/* 66 */                Bundle bundle2 = new Bundle(bundle);
/* 73 */                Iterator<String> it = bundle2.keySet().iterator();
/* 81 */                while (it.hasNext()) {
/* 83 */                    String next = it.next();
/* 89 */                    if (next == null) {
/* 91 */                        l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 93 */                        l0olllO1i.I000II(l01o0io1ooo02);
/* 100 */                       l01o0io1ooo02.I00ilO0.I00000oOI("Param name can't be null");
/* 103 */                       it.remove();
                            } else {
/* 107 */                       lioil0ilIOi lioil0ilioi = l0olllo1i.I00l0I0l0lO1;
/* 109 */                       l0olllO1i.I0000oI00(lioil0ilioi);
/* 116 */                       Object objI010o0o0oO = lioil0ilioi.I010o0o0oO(next, bundle2.get(next));
/* 120 */                       if (objI010o0o0oO == null) {
/* 122 */                           l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i.I00ilO0;
/* 124 */                           l0olllO1i.I000II(l01o0io1ooo03);
/* 137 */                           l01o0io1ooo03.I00l0I0l0lO1.I0000Il00O("Param value can't be null", l0olllo1i.I00l0OO0IO.I00000oOI(next));
/* 140 */                           it.remove();
                                } else {
/* 144 */                           lioil0ilIOi lioil0ilioi2 = l0olllo1i.I00l0I0l0lO1;
/* 146 */                           l0olllO1i.I0000oI00(lioil0ilioi2);
/* 149 */                           lioil0ilioi2.I011IOil(bundle2, next, objI010o0o0oO);
                                }
                            }
                        }
/* 155 */               ii0il0loolio = new ii0il0lOolIo(bundle2);
                    }
/* 169 */           this.I000II = ii0il0loolio;
                }

                public final ii00010lll1 I00000oIO(l0olllO1i l0olllo1i, long j) {
/* 1 */             ii0il0lOolIo ii0il0loolio = this.I000II;
/* 3 */             String str = this.I0000Il00O;
/* 5 */             String str2 = this.I00000oIO;
/* 7 */             String str3 = this.I00000oOI;
/* 9 */             long j2 = this.I0000O;
/* 11 */            long j3 = this.I0000oI00;
/* 15 */            ii00010lll1 ii00010lll1Var = new ii00010lll1();
/* 18 */            lII0I0I000I.I0000O(str2);
/* 21 */            lII0I0I000I.I0000O(str3);
/* 24 */            lII0I0I000I.I000II(ii0il0loolio);
/* 27 */            ii00010lll1Var.I00000oIO = str2;
/* 29 */            ii00010lll1Var.I00000oOI = str3;
/* 36 */            if (true == TextUtils.isEmpty(str)) {
/* 38 */                str = null;
                    }
/* 39 */            ii00010lll1Var.I0000Il00O = str;
/* 41 */            ii00010lll1Var.I0000O = j2;
/* 43 */            ii00010lll1Var.I0000oI00 = j3;
/* 45 */            ii00010lll1Var.I0001Ioi1lo = j;
/* 51 */            if (j != 0 && j > j2) {
/* 57 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 59 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 74 */                l01o0io1ooo0.I00l0I0l0lO1.I0000O(l01O0IO1ooO0.I010ioo(str2), "Event created with reverse previous/current timestamps. appId, name", l01O0IO1ooO0.I010ioo(str3));
                    }
/* 77 */            ii00010lll1Var.I000II = ii0il0loolio;
/* 79 */            VarHandle.storeStoreFence();
/* 106 */           return ii00010lll1Var;
                }

                public final String toString() {
/* 3 */             String string = this.I000II.toString();
/* 7 */             String str = this.I00000oIO;
/* 13 */            int length = String.valueOf(str).length();
/* 17 */            String str2 = this.I00000oOI;
/* 41 */            StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
/* 48 */            IIl001iO0Io.I001lIiIIo1O(sb, "Event{appId='", str, "', name='", str2);
/* 55 */            return IIlIOloOOO.I0010I0i(sb, "', params=", string, "}");
                }
            }
