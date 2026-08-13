            package p000;

            import android.os.Bundle;
            import android.os.SystemClock;
            import java.lang.invoke.VarHandle;
            import java.util.Objects;
            import java.util.concurrent.ConcurrentHashMap;
            
            public final class lO0liIO0 extends iolOI0li {
                public volatile lIol0ili1Oi I00iiO;
                public volatile lIol0ili1Oi I00iio;
                public lIol0ili1Oi I00ilI0I1;
                public ConcurrentHashMap I00ilO0;
                public il1l0io1O I00io1l;
                public volatile boolean I00ioIO;
                public volatile lIol0ili1Oi I00l0I0l0lO1;
                public lIol0ili1Oi I00l0OO0IO;
                public boolean I00li1OI;
                public Object I00ll1;

                @Override
                public final boolean I010iIIOlo() {
/* 1 */             return false;
                }

                public final lIol0ili1Oi I010ioo(boolean z) {
/* 1 */             I010OIo1l();
/* 4 */             I010II();
/* 7 */             lIol0ili1Oi liol0ili1oi = this.I00ilI0I1;
                    return (z && liol0ili1oi == null) ? this.I00l0OO0IO : liol0ili1oi;
                }

                public final String I010l10O(String str) {
/* 1 */             if (str == null) {
/* 3 */                 return "Activity";
                    }
/* 8 */             String[] strArrSplit = str.split("\\.");
/* 12 */            int length = strArrSplit.length;
/* 20 */            String str2 = length > 0 ? strArrSplit[length - 1] : "";
/* 24 */            l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 26 */            int length2 = str2.length();
/* 32 */            l0olllo1i.I00iio.getClass();
/* 37 */            if (length2 <= 500) {
/* 77 */                return str2;
                    }
/* 41 */            l0olllo1i.I00iio.getClass();
/* 45 */            return str2.substring(0, 500);
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I010l1O(lIol0ili1Oi liol0ili1oi, lIol0ili1Oi liol0ili1oi2, long j, boolean z, Bundle bundle) {
                    boolean z2;
                    Bundle bundle2;
                    long j2;
/* 11 */            boolean z3 = liol0ili1oi.I0000oI00;
/* 15 */            l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 17 */            I010II();
/* 20 */            boolean z4 = false;
/* 22 */            if (liol0ili1oi2 != null) {
/* 54 */                z2 = (liol0ili1oi2.I0000Il00O == liol0ili1oi.I0000Il00O && Objects.equals(liol0ili1oi2.I00000oOI, liol0ili1oi.I00000oOI) && Objects.equals(liol0ili1oi2.I00000oIO, liol0ili1oi.I00000oIO)) ? false : true;
                    }
/* 55 */            if (z && this.I00ilI0I1 != null) {
/* 61 */                z4 = true;
                    }
/* 62 */            if (z2) {
/* 74 */                Bundle bundle3 = bundle != null ? new Bundle(bundle) : new Bundle();
/* 77 */                lioil0ilIOi.I01O1I1(liol0ili1oi, bundle3, true);
/* 80 */                if (liol0ili1oi2 != null) {
/* 82 */                    String str = liol0ili1oi2.I00000oIO;
/* 84 */                    if (str != null) {
/* 88 */                        bundle3.putString("_pn", str);
                            }
/* 91 */                    String str2 = liol0ili1oi2.I00000oOI;
/* 93 */                    if (str2 != null) {
/* 97 */                        bundle3.putString("_pc", str2);
                            }
/* 104 */                   bundle3.putLong("_pi", liol0ili1oi2.I0000Il00O);
                        }
/* 109 */               if (z4) {
/* 111 */                   li10O1l0 li10o1l0 = l0olllo1i.I00ioIO;
/* 113 */                   l0olllO1i.I0001Ioi1lo(li10o1l0);
/* 116 */                   OooI11loO0I oooI11loO0I = li10o1l0.I00ilO0;
/* 120 */                   long j3 = j - oooI11loO0I.I00iiI;
/* 122 */                   oooI11loO0I.I00iiI = j;
/* 126 */                   if (j3 > 0) {
/* 128 */                       lioil0ilIOi lioil0ilioi = l0olllo1i.I00l0I0l0lO1;
/* 130 */                       l0olllO1i.I0000oI00(lioil0ilioi);
/* 133 */                       lioil0ilioi.I01Ilioliio(bundle3, j3);
                            }
                        }
/* 136 */               iIl1iil iil1iil = l0olllo1i.I00iio;
/* 138 */               Iioi0lilII iioi0lilII = l0olllo1i.I00li1OI;
/* 144 */               if (!iil1iil.I0111i()) {
/* 150 */                   bundle3.putLong("_mst", 1L);
                        }
/* 158 */               String str3 = true != z3 ? "auto" : "app";
/* 160 */               iioi0lilII.getClass();
/* 163 */               long jCurrentTimeMillis = System.currentTimeMillis();
/* 169 */               if (z3) {
/* 171 */                   long j4 = liol0ili1oi.I0001Ioi1lo;
/* 179 */                   long j5 = j4 != 0 ? j4 : jCurrentTimeMillis;
/* 196 */                   long jElapsedRealtime = l0olllo1i.I00iio.I01101IOlO(null, iol1II1ii1i.I01101olii) ? SystemClock.elapsedRealtime() : 0L;
/* 198 */                   if (z3) {
/* 200 */                       bundle2 = bundle3;
/* 202 */                       long j6 = liol0ili1oi.I000II;
/* 206 */                       if (j6 != 0) {
/* 208 */                           j2 = j6;
                                }
/* 215 */                       lIl1O1li lil1o1li = l0olllo1i.I00lli11;
/* 217 */                       l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 223 */                       lil1o1li.I010lI0oi(str3, "_vs", j5, j2, bundle2);
                            } else {
/* 211 */                       bundle2 = bundle3;
                            }
/* 213 */                   j2 = jElapsedRealtime;
/* 215 */                   lIl1O1li lil1o1li2 = l0olllo1i.I00lli11;
/* 217 */                   l0olllO1i.I0001Ioi1lo(lil1o1li2);
/* 223 */                   lil1o1li2.I010lI0oi(str3, "_vs", j5, j2, bundle2);
                        }
                    }
/* 226 */           if (z4) {
/* 231 */               I010o0o0oO(this.I00ilI0I1, true, j);
                    }
/* 234 */           this.I00ilI0I1 = liol0ili1oi;
/* 236 */           if (z3) {
/* 238 */               this.I00l0OO0IO = liol0ili1oi;
                    }
/* 240 */           lOliOlO1Io loliolo1ioI000OOo1O = l0olllo1i.I000OOo1O();
/* 244 */           loliolo1ioI000OOo1O.I010II();
/* 247 */           loliolo1ioI000OOo1O.I010OIo1l();
/* 254 */           l0iOoII1Il l0iooii1il = new l0iOoII1Il(11);
/* 257 */           l0iooii1il.I00iiI = liol0ili1oi;
/* 259 */           l0iooii1il.I00iiO = loliolo1ioI000OOo1O;
/* 261 */           VarHandle.storeStoreFence();
/* 264 */           loliolo1ioI000OOo1O.I0110o(l0iooii1il);
                }

                public final void I010l1ol111(il1l0io1O il1l0io1o, Bundle bundle) {
                    Bundle bundle2;
/* 11 */            if (!((l0olllO1i) this.I00iOIl).I00iio.I0111i() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
/* 106 */               return;
                    }
/* 55 */            this.I00ilO0.put(Integer.valueOf(il1l0io1o.I00iOIl), new lIol0ili1Oi(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
                }

                public final void I010lI0oi(String str, lIol0ili1Oi liol0ili1oi, boolean z) {
/* 8 */             lIol0ili1Oi liol0ili1oi2 = this.I00iiO == null ? this.I00iio : this.I00iiO;
/* 12 */            if (liol0ili1oi.I00000oOI == null) {
/* 36 */                liol0ili1oi = new lIol0ili1Oi(liol0ili1oi.I00000oIO, str != null ? I010l10O(str) : null, liol0ili1oi.I0000Il00O, liol0ili1oi.I0000oI00, liol0ili1oi.I0001Ioi1lo, liol0ili1oi.I000II);
                    }
/* 42 */            this.I00iio = this.I00iiO;
/* 44 */            this.I00iiO = liol0ili1oi;
/* 48 */            l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 52 */            l0olllo1i.I00li1OI.getClass();
/* 55 */            long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 59 */            l0o10OoO0 l0o10ooo0 = l0olllo1i.I00io1l;
/* 61 */            l0olllO1i.I000II(l0o10ooo0);
/* 66 */            lIoooI00I lioooi00i = new lIoooI00I();
/* 69 */            lioooi00i.I00iOIl = liol0ili1oi;
/* 71 */            lioooi00i.I00iiI = liol0ili1oi2;
/* 73 */            lioooi00i.I00iiO = jElapsedRealtime;
/* 75 */            lioooi00i.I00iio = z;
/* 77 */            lioooi00i.I00ilI0I1 = this;
/* 79 */            VarHandle.storeStoreFence();
/* 82 */            l0o10ooo0.I010o0o0oO(lioooi00i);
                }

                public final void I010o0o0oO(lIol0ili1Oi liol0ili1oi, boolean z, long j) {
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 5 */             il11ll0i il11ll0iVar = l0olllo1i.I00lll10;
/* 7 */             l0olllO1i.I0000O(il11ll0iVar);
/* 12 */            l0olllo1i.I00li1OI.getClass();
/* 19 */            il11ll0iVar.I010iIIOlo(SystemClock.elapsedRealtime());
/* 31 */            boolean z2 = liol0ili1oi != null && liol0ili1oi.I0000O;
/* 32 */            li10O1l0 li10o1l0 = l0olllo1i.I00ioIO;
/* 34 */            l0olllO1i.I0001Ioi1lo(li10o1l0);
/* 43 */            if (!li10o1l0.I00ilO0.I0000oI00(j, z2, z) || liol0ili1oi == null) {
/* 98 */                return;
                    }
/* 47 */            liol0ili1oi.I0000O = false;
                }

                public final lIol0ili1Oi I010oio1OO0(il1l0io1O il1l0io1o) {
/* 1 */             lII0I0I000I.I000II(il1l0io1o);
/* 6 */             Integer numValueOf = Integer.valueOf(il1l0io1o.I00iOIl);
/* 10 */            ConcurrentHashMap concurrentHashMap = this.I00ilO0;
/* 16 */            lIol0ili1Oi liol0ili1oi = (lIol0ili1Oi) concurrentHashMap.get(numValueOf);
/* 18 */            if (liol0ili1oi == null) {
/* 22 */                String strI010l10O = I010l10O(il1l0io1o.I00iiI);
/* 32 */                lioil0ilIOi lioil0ilioi = ((l0olllO1i) this.I00iOIl).I00l0I0l0lO1;
/* 34 */                l0olllO1i.I0000oI00(lioil0ilioi);
/* 42 */                lIol0ili1Oi liol0ili1oi2 = new lIol0ili1Oi(null, strI010l10O, lioil0ilioi.I01OIo());
/* 45 */                concurrentHashMap.put(numValueOf, liol0ili1oi2);
/* 48 */                liol0ili1oi = liol0ili1oi2;
                    }
                    return this.I00l0I0l0lO1 != null ? this.I00l0I0l0lO1 : liol0ili1oi;
                }
            }
