            package p000;

            import android.hardware.camera2.CaptureResult;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.EnumSet;
            import java.util.Objects;
            import java.util.Set;
            
            public abstract class IOol1li {
                public static final Set I00000oIO = Collections.unmodifiableSet(EnumSet.of(IIl1lO0oO.I00iio, IIl1lO0oO.I00ilI0I1, IIl1lO0oO.I00ilO0, IIl1lO0oO.I00io1l));
                public static final Set I00000oOI = Collections.unmodifiableSet(EnumSet.of(IIl1oi.I00iio, IIl1oi.I00iOIl));
                public static final Set I0000Il00O;
                public static final Set I0000O;

                static {
/* 33 */            IIl1lO0O iIl1lO0O = IIl1lO0O.I00ilI0I1;
/* 35 */            IIl1lO0O iIl1lO0O2 = IIl1lO0O.I00iio;
/* 37 */            IIl1lO0O iIl1lO0O3 = IIl1lO0O.I00iOIl;
/* 43 */            Set setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(iIl1lO0O, iIl1lO0O2, iIl1lO0O3));
/* 47 */            I0000Il00O = setUnmodifiableSet;
/* 49 */            EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
/* 53 */            enumSetCopyOf.remove(iIl1lO0O2);
/* 56 */            enumSetCopyOf.remove(iIl1lO0O3);
/* 63 */            I0000O = Collections.unmodifiableSet(enumSetCopyOf);
                }

                /* JADX WARN: Removed duplicated region for block: B:107:0x0131 A[PHI: r5
                  0x0131: PHI (r5v3 char) = (r5v1 char), (r5v0 char) binds: [B:122:0x0151, B:106:0x012f] A[DONT_GENERATE, DONT_INLINE]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static boolean I00000oIO(IO01oO iO01oO, boolean z) {
                    char c;
                    char c2;
/* 3 */             I0oIl0101 i0oIl0101I0000Il00O = iO01oO.I00iiI.I0000Il00O();
/* 15 */            Integer num = (Integer) i0oIl0101I0000Il00O.I00iOIl.get(CaptureResult.CONTROL_AF_MODE);
/* 19 */            char c3 = 5;
/* 21 */            char c4 = 4;
/* 24 */            if ((num != null && num.intValue() == 0) || (num != null && num.intValue() == 5)) {
/* 105 */               c = 2;
                    } else if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 2)) {
/* 103 */               c = 3;
                    } else if ((num != null && num.intValue() == 4) || (num != null && num.intValue() == 3)) {
/* 101 */               c = 4;
                    } else {
/* 81 */                if (num != null && l11I11lO.I0000O(3, "CXCP")) {
/* 96 */                    IllIiOlOoIll.I00000oIO(i0oIl0101I0000Il00O.I00iOIl.getFrameNumber());
                        }
/* 99 */                c = 1;
                    }
/* 124 */           boolean z2 = c == 2 || I00000oIO.contains(iO01oO.I000OiO());
/* 127 */           I0oIl0101 i0oIl0101I0000Il00O2 = iO01oO.I00iiI.I0000Il00O();
/* 139 */           Integer num2 = (Integer) i0oIl0101I0000Il00O2.I00iOIl.get(CaptureResult.CONTROL_AE_MODE);
/* 142 */           if (num2 != null && num2.intValue() == 0) {
/* 151 */               c2 = 2;
                    } else if (num2 != null && num2.intValue() == 1) {
/* 162 */               c2 = 3;
                    } else if (num2 != null && num2.intValue() == 2) {
/* 173 */               c2 = 4;
                    } else if (num2 != null && num2.intValue() == 3) {
/* 184 */               c2 = 5;
                    } else if (num2 != null && num2.intValue() == 4) {
/* 195 */               c2 = 6;
                    } else {
/* 197 */               if (num2 != null && l11I11lO.I0000O(3, "CXCP")) {
/* 212 */                   IllIiOlOoIll.I00000oIO(i0oIl0101I0000Il00O2.I00iOIl.getFrameNumber());
                        }
/* 215 */               c2 = 1;
                    }
/* 220 */           boolean z3 = c2 == 2;
/* 240 */           boolean z4 = !z ? !(z3 || I0000Il00O.contains(iO01oO.I000OOo1O())) : !(z3 || I0000O.contains(iO01oO.I000OOo1O()));
/* 259 */           I0oIl0101 i0oIl0101I0000Il00O3 = iO01oO.I00iiI.I0000Il00O();
/* 271 */           Integer num3 = (Integer) i0oIl0101I0000Il00O3.I00iOIl.get(CaptureResult.CONTROL_AWB_MODE);
/* 273 */           if (num3 != null && num3.intValue() == 0) {
/* 282 */               c3 = 2;
                    } else if (num3 != null && num3.intValue() == 1) {
/* 294 */               c3 = 3;
                    } else if (num3 != null && num3.intValue() == 2) {
/* 306 */               c3 = c4;
                    } else if (num3 == null || num3.intValue() != 3) {
/* 319 */               if (num3 != null && num3.intValue() == 4) {
/* 328 */                   c3 = 6;
                        } else {
/* 330 */                   c4 = 7;
/* 331 */                   if (num3 == null || num3.intValue() != 5) {
/* 341 */                       c3 = '\b';
/* 343 */                       if (num3 == null || num3.intValue() != 6) {
/* 353 */                           if (num3 != null && num3.intValue() == 7) {
/* 362 */                               c3 = '\t';
                                    } else if (num3 != null && num3.intValue() == 8) {
/* 374 */                               c3 = '\n';
                                    } else {
/* 377 */                               if (num3 != null && l11I11lO.I0000O(3, "CXCP")) {
/* 392 */                                   IllIiOlOoIll.I00000oIO(i0oIl0101I0000Il00O3.I00iOIl.getFrameNumber());
                                        }
/* 395 */                               c3 = 1;
                                    }
                                }
                            }
                        }
                    }
/* 413 */           boolean z5 = c3 == 2 || I00000oOI.contains(iO01oO.I0001Ioi1lo());
/* 418 */           Objects.toString(iO01oO.I000OOo1O());
/* 425 */           Objects.toString(iO01oO.I000OiO());
/* 432 */           Objects.toString(iO01oO.I0001Ioi1lo());
/* 437 */           l11I11lO.I0000O(3, "ConvergenceUtils");
                    return z2 && z4 && z5;
                }
            }
