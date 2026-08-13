            package p000;
            
            public final class IiOiOloo0 {
                public final I0I1liIO0ii I00000oIO;
                public final int I00000oOI;

                public IiOiOloo0(I0I1liIO0ii i0I1liIO0ii, int i) {
/* 1 */             this.I00000oOI = i;
/* 6 */             this.I00000oIO = i0I1liIO0ii;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:129:0x0226 A[ADDED_TO_REGION, LOOP:1: B:129:0x0226->B:141:0x0257, LOOP_START, PHI: r12
                  0x0226: PHI (r12v1 Ii1Ool1) = (r12v0 Ii1Ool1), (r12v2 Ii1Ool1) binds: [B:127:0x0223, B:141:0x0257] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r11v0, types: [Ii1Ool1, Ii1i0O0o] */
                /* JADX WARN: Type inference failed for: r11v1, types: [Ii1Ool1] */
                /* JADX WARN: Type inference failed for: r11v2, types: [Ii1Ool1] */
                /* JADX WARN: Type inference failed for: r11v3, types: [Ii1Ool1] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I00000oIO(OOlo0i0 oOlo0i0, Ii1i0O0o ii1i0O0o, Ii1Ool1 ii1Ool1) {
                    Ii1Ool1 ii1Ool1I000O01llI0;
                    OI000ilOol oI000ilOol;
                    switch (this.I00000oOI) {
                        case 0:
/* 497 */                   if (ii1Ool1 == null) {
/* 625 */                       throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1", "isVisible"));
                            }
/* 503 */                   if (IiOiIO0i1Oil.I00100o1O0lo(ii1i0O0o) && IiOiIO0i1Oil.I0000oI00(ii1Ool1) != Iioi0lilII.I00io1l) {
/* 513 */                       return IiOiioI.I0000O(ii1i0O0o, ii1Ool1);
                            }
/* 520 */                   if (ii1i0O0o instanceof IOo1IIOOiO1o) {
/* 525 */                       ((IOo1IIOOiO1o) ii1i0O0o).I000lI();
                            }
/* 528 */                   while (ii1i0O0o != 0) {
/* 530 */                       ii1i0O0o = ii1i0O0o.I000lI();
/* 536 */                       if (((ii1i0O0o instanceof OI000ilOol) && !IiOiIO0i1Oil.I000iOII(ii1i0O0o)) || (ii1i0O0o instanceof OIo0il)) {
/* 548 */                           if (ii1i0O0o != 0) {
/* 13 */                                return false;
                                    }
/* 551 */                           while (ii1Ool1 != null) {
/* 553 */                               if (ii1i0O0o != ii1Ool1) {
/* 558 */                                   if (!(ii1Ool1 instanceof OIo0il)) {
/* 600 */                                       ii1Ool1 = ii1Ool1.I000lI();
                                            } else if (!(ii1i0O0o instanceof OIo0il) || !((OIo0l0) ii1i0O0o).I00ilI0I1.equals(((OIo0l0) ((OIo0il) ii1Ool1)).I00ilI0I1) || !IiOiIO0i1Oil.I0000Il00O(ii1Ool1).equals(IiOiIO0i1Oil.I0000Il00O(ii1i0O0o))) {
/* 13 */                                        return false;
                                            }
                                        }
/* 14 */                                return true;
                                    }
/* 13 */                            return false;
                                }
                            }
/* 548 */                   if (ii1i0O0o != 0) {
                            }
                            break;
                        case 1:
/* 429 */                   if (ii1Ool1 == null) {
/* 496 */                       throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2", "isVisible"));
                            }
/* 437 */                   if (!IiOiioI.I00000oIO.I00000oIO(oOlo0i0, ii1i0O0o, ii1Ool1)) {
/* 13 */                        return false;
                            }
/* 441 */                   if (oOlo0i0 == IiOiioI.I000l1) {
/* 14 */                        return true;
                            }
/* 447 */                   if (oOlo0i0 == IiOiioI.I000iOII || (ii1Ool1I000O01llI0 = IiOiIO0i1Oil.I000O01llI0(ii1i0O0o, OI000ilOol.class, true)) == null || !(oOlo0i0 instanceof IoioOiO1)) {
/* 13 */                        return false;
                            }
/* 472 */                   return ((IoioOiO1) oOlo0i0).I00iOIl.I010i10l().equals(ii1Ool1I000O01llI0.I010i10l());
                        case 2:
/* 272 */                   if (ii1Ool1 == null) {
/* 428 */                       throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3", "isVisible"));
                            }
/* 278 */                   OI000ilOol oI000ilOol2 = (OI000ilOol) IiOiIO0i1Oil.I000O01llI0(ii1i0O0o, OI000ilOol.class, true);
/* 284 */                   OI000ilOol oI000ilOol3 = (OI000ilOol) IiOiIO0i1Oil.I000O01llI0(ii1Ool1, OI000ilOol.class, false);
/* 286 */                   if (oI000ilOol3 == null) {
/* 13 */                        return false;
                            }
/* 290 */                   if (oI000ilOol2 == null || !IiOiIO0i1Oil.I000iOII(oI000ilOol2) || (oI000ilOol = (OI000ilOol) IiOiIO0i1Oil.I000O01llI0(oI000ilOol2, OI000ilOol.class, true)) == null || !IiOiIO0i1Oil.I00100l0(oI000ilOol3.I00Ol10(), oI000ilOol.I010i10l())) {
/* 333 */                       IIiO00o1o iIiO00o1oI0010I0i = ii1i0O0o instanceof IIiO00o1o ? IiOiIO0i1Oil.I0010I0i((IIiO00o1o) ii1i0O0o) : ii1i0O0o;
/* 338 */                       OI000ilOol oI000ilOol4 = (OI000ilOol) IiOiIO0i1Oil.I000O01llI0(iIiO00o1oI0010I0i, OI000ilOol.class, true);
/* 340 */                       if (oI000ilOol4 == null) {
/* 13 */                            return false;
                                }
/* 355 */                       if (IiOiIO0i1Oil.I00100l0(oI000ilOol3.I00Ol10(), oI000ilOol4.I010i10l()) && oOlo0i0 != IiOiioI.I000lI) {
/* 364 */                           if ((iIiO00o1oI0010I0i instanceof IIiO00o1o) && !(iIiO00o1oI0010I0i instanceof IOo1IIOOiO1o) && oOlo0i0 != IiOiioI.I000l1) {
/* 379 */                               if (oOlo0i0 != IiOiioI.I000iOII && oOlo0i0 != null) {
/* 384 */                                   O0iIl1 type = oOlo0i0.getType();
/* 392 */                                   if (!IiOiIO0i1Oil.I00100l0(type, oI000ilOol3)) {
/* 394 */                                       type.I00l0OO0IO();
                                            }
                                        }
                                    }
                                }
/* 404 */                       return I00000oIO(oOlo0i0, ii1i0O0o, oI000ilOol3.I000lI());
                            }
/* 14 */                    return true;
                        case 3:
/* 228 */                   if (ii1Ool1 == null) {
/* 271 */                       throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4", "isVisible"));
                            }
/* 242 */                   if (!IiOiIO0i1Oil.I0000Il00O(ii1Ool1).I00II0Ol1O0l(IiOiIO0i1Oil.I0000Il00O(ii1i0O0o))) {
/* 13 */                        return false;
                            }
/* 247 */                   IiOiioI.I000o00OoI0I.getClass();
/* 14 */                    return true;
                        case 4:
/* 205 */                   if (ii1Ool1 != null) {
/* 14 */                        return true;
                            }
/* 227 */                   throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5", "isVisible"));
                        case 5:
/* 175 */                   if (ii1Ool1 == null) {
/* 196 */                       throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6", "isVisible"));
                            }
/* 204 */                   throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
                        case 6:
/* 145 */                   if (ii1Ool1 == null) {
/* 166 */                       throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7", "isVisible"));
                            }
/* 174 */                   throw new IllegalStateException("Visibility is unknown yet");
                        case 7:
/* 122 */                   if (ii1Ool1 != null) {
/* 13 */                        return false;
                            }
/* 144 */                   throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8", "isVisible"));
                        case 8:
/* 99 */                    if (ii1Ool1 != null) {
/* 13 */                        return false;
                            }
/* 121 */                   throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9", "isVisible"));
                        case 9:
/* 72 */                    if (ii1Ool1 != null) {
/* 74 */                        return O00ll1lIl01l.I00000oOI(ii1i0O0o, ii1Ool1);
                            }
/* 98 */                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1", "isVisible"));
                        case 10:
/* 45 */                    if (ii1Ool1 != null) {
/* 47 */                        return O00ll1lIl01l.I0000Il00O(oOlo0i0, ii1i0O0o, ii1Ool1);
                            }
/* 71 */                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2", "isVisible"));
                        default:
/* 18 */                    if (ii1Ool1 != null) {
/* 20 */                        return O00ll1lIl01l.I0000Il00O(oOlo0i0, ii1i0O0o, ii1Ool1);
                            }
/* 44 */                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3", "isVisible"));
                    }
                }

                public final String toString() {
/* 3 */             return this.I00000oIO.I0000oI00();
                }
            }
