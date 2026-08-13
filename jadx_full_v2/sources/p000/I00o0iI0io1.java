            package p000;
            
            public abstract class I00o0iI0io1 extends I01illiiIill {
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I00o0iI0io1(O1I0OloI o1I0OloI) {
/* 3 */             super(o1I0OloI);
/* 1 */             if (o1I0OloI != null) {
                    } else {
/* 8 */                 I000OiO(0);
/* 49 */                throw null;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void I000OiO(int i) {
/* 13 */            String str = (i == 1 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
/* 25 */            Object[] objArr = new Object[(i == 1 || i == 3 || i == 4) ? 2 : 3];
/* 30 */            if (i == 1) {
/* 48 */                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
                    } else if (i == 2) {
/* 45 */                objArr[0] = "classifier";
                    } else if (i != 3 && i != 4) {
/* 40 */                objArr[0] = "storageManager";
                    }
/* 50 */            if (i == 1) {
/* 66 */                objArr[1] = "getBuiltIns";
                    } else if (i == 3 || i == 4) {
/* 61 */                objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
                    } else {
/* 56 */                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
                    }
/* 68 */            if (i != 1) {
/* 70 */                if (i == 2) {
/* 83 */                    objArr[2] = "isSameClassifier";
                        } else if (i != 3 && i != 4) {
/* 78 */                    objArr[2] = "<init>";
                        }
                    }
/* 85 */            String str2 = String.format(str, objArr);
/* 89 */            if (i != 1 && i != 3 && i != 4) {
/* 186 */               throw new IllegalArgumentException(str2);
                    }
/* 186 */           throw new IllegalStateException(str2);
                }

                @Override
                public final O0iIl1 I00000oOI() {
/* 1 */             OI000ilOol oI000ilOolI00100o1O0lo = I00100o1O0lo();
/* 6 */             if (oI000ilOolI00100o1O0lo == null) {
/* 39 */                O0i1lI0o1io.I00000oIO(107);
/* 113 */               throw null;
                    }
/* 8 */             OI1Iio0ii1 oI1Iio0ii1 = O0i1lI0o1io.I0000oI00;
/* 16 */            if (O0i1lI0o1io.I00000oOI(oI000ilOolI00100o1O0lo, OlIllOO11lOl.I00000oIO) || O0i1lI0o1io.I00000oOI(oI000ilOolI00100o1O0lo, OlIllOO11lOl.I00000oOI)) {
/* 5 */                 return null;
                    }
/* 31 */            return I0000O().I0000oI00();
                }

                @Override
                public final O0i1lI0o1io I0000O() {
/* 5 */             O0i1lI0o1io o0i1lI0o1ioI0000oI00 = IiOiOOIo.I0000oI00(I00100o1O0lo());
/* 9 */             if (o0i1lI0o1ioI0000oI00 != null) {
/* 11 */                return o0i1lI0o1ioI0000oI00;
                    }
/* 13 */            I000OiO(1);
/* 29 */            throw null;
                }

                /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
                
                    r4 = true;
                 */
                /* JADX WARN: Removed duplicated region for block: B:31:0x006d A[RETURN] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I000O01llI0(IOIiO1lIl0l iOIiO1lIl0l) {
                    boolean z;
/* 4 */             if (iOIiO1lIl0l instanceof OI000ilOol) {
/* 6 */                 OI000ilOol oI000ilOolI00100o1O0lo = I00100o1O0lo();
/* 23 */                if (O0000Ioio00.I0000O(oI000ilOolI00100o1O0lo.getName(), iOIiO1lIl0l.getName())) {
/* 27 */                    Ii1Ool1 ii1Ool1I000lI = oI000ilOolI00100o1O0lo.I000lI();
/* 31 */                    Ii1Ool1 ii1Ool1I000lI2 = iOIiO1lIl0l.I000lI();
                            while (true) {
/* 35 */                        if (ii1Ool1I000lI != null && ii1Ool1I000lI2 != null) {
/* 41 */                            if (!(ii1Ool1I000lI instanceof OI0010oo1o)) {
/* 48 */                                if (!(ii1Ool1I000lI2 instanceof OI0010oo1o)) {
/* 53 */                                    if (!(ii1Ool1I000lI instanceof OIo0il)) {
/* 81 */                                        if ((ii1Ool1I000lI2 instanceof OIo0il) || !O0000Ioio00.I0000O(ii1Ool1I000lI.getName(), ii1Ool1I000lI2.getName())) {
                                                    break;
                                                }
/* 99 */                                        ii1Ool1I000lI = ii1Ool1I000lI.I000lI();
/* 103 */                                       ii1Ool1I000lI2 = ii1Ool1I000lI2.I000lI();
                                            } else if (!(ii1Ool1I000lI2 instanceof OIo0il) || !O0000Ioio00.I0000O(((OIo0l0) ((OIo0il) ii1Ool1I000lI)).I00ilI0I1, ((OIo0l0) ((OIo0il) ii1Ool1I000lI2)).I00ilI0I1)) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
/* 43 */                                z = ii1Ool1I000lI2 instanceof OI0010oo1o;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
/* 25 */                    z = false;
/* 108 */                   if (!z) {
                            }
                        } else {
/* 25 */                    z = false;
/* 108 */                   if (!z) {
/* 22 */                        return true;
                            }
                        }
                    }
/* 3 */             return false;
                }

                @Override
                public abstract OI000ilOol I00100o1O0lo();
            }
