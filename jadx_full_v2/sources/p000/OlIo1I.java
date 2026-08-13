            package p000;

            import java.lang.invoke.VarHandle;
            
/* 27 */    public final class OlIo1I extends OoOi1Ol {
                public final int I00000oIO = 1;
                public final Object I00000oOI;
                public final Object I0000Il00O;

                public OlIo1I(OoOOiO ooOOiO) {
/* 7 */             this.I00000oOI = ooOOiO;
/* 9 */             O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iOIl;
/* 14 */            O0l1iloO o0l1iloO = new O0l1iloO(6);
/* 17 */            o0l1iloO.I00iiI = this;
/* 19 */            VarHandle.storeStoreFence();
/* 26 */            this.I0000Il00O = l0oi0lOi11i.I00000oIO(o0oI01I0oo, o0l1iloO);
                }

                public static void I0000oI00(int i) {
/* 10 */            String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
/* 21 */            Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
                    switch (i) {
                        case 1:
                        case 2:
                        case 3:
/* 44 */                    objArr[0] = "type";
                            break;
                        case 4:
                        case 5:
/* 39 */                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                            break;
                        case 6:
/* 36 */                    objArr[0] = "kotlinTypeRefiner";
                            break;
                        default:
/* 31 */                    objArr[0] = "projection";
                            break;
                    }
/* 47 */            if (i == 4) {
/* 61 */                objArr[1] = "getProjectionKind";
                    } else if (i != 5) {
/* 51 */                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                    } else {
/* 56 */                objArr[1] = "getType";
                    }
/* 63 */            if (i == 3) {
/* 84 */                objArr[2] = "replaceType";
                    } else if (i != 4 && i != 5) {
/* 70 */                if (i != 6) {
/* 74 */                    objArr[2] = "<init>";
                        } else {
/* 79 */                    objArr[2] = "refine";
                        }
                    }
/* 86 */            String str2 = String.format(str, objArr);
/* 90 */            if (i != 4 && i != 5) {
/* 105 */               throw new IllegalArgumentException(str2);
                    }
/* 105 */           throw new IllegalStateException(str2);
                }

                @Override
                public final Ooo0Ioii0o0 I00000oIO() {
                    switch (this.I00000oIO) {
                        case 0:
/* 19 */                    return Ooo0Ioii0o0.I00ilI0I1;
                        default:
/* 8 */                     Ooo0Ioii0o0 ooo0Ioii0o0 = (Ooo0Ioii0o0) this.I00000oOI;
/* 10 */                    if (ooo0Ioii0o0 != null) {
/* 12 */                        return ooo0Ioii0o0;
                            }
/* 14 */                    I0000oI00(4);
/* 18 */                    throw null;
                    }
                }

                @Override
                public final O0iIl1 I00000oOI() {
/* 1 */             int i = this.I00000oIO;
/* 3 */             Object obj = this.I0000Il00O;
                    switch (i) {
                        case 0:
/* 25 */                    return (O0iIl1) ((O0ioIllo0i1) obj).getValue();
                        default:
/* 8 */                     O0iIl1 o0iIl1 = (O0iIl1) obj;
/* 10 */                    if (o0iIl1 != null) {
/* 12 */                        return o0iIl1;
                            }
/* 14 */                    I0000oI00(5);
/* 18 */                    throw null;
                    }
                }

                @Override
                public final boolean I0000Il00O() {
                    switch (this.I00000oIO) {
                        case 0:
/* 8 */                     return true;
                        default:
/* 6 */                     return false;
                    }
                }

                @Override
                public final OoOi1Ol I0000O(O0iIoIOO0O0 o0iIoIOO0O0) {
                    switch (this.I00000oIO) {
                        case 0:
/* 20 */                    return this;
                        default:
/* 16 */                    return new OlIo1I((O0iIl1) this.I0000Il00O, (Ooo0Ioii0o0) this.I00000oOI);
                    }
                }

/* 28 */        public OlIo1I(O0iIl1 o0iIl1, Ooo0Ioii0o0 ooo0Ioii0o0) {
                    if (ooo0Ioii0o0 == null) {
                        I0000oI00(0);
                        throw null;
                    }
                    if (o0iIl1 != null) {
/* 30 */                this.I00000oOI = ooo0Ioii0o0;
/* 31 */                this.I0000Il00O = o0iIl1;
                    } else {
/* 32 */                I0000oI00(1);
                        throw null;
                    }
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 32 */        public OlIo1I(O0iIl1 o0iIl1) {
/* 33 */            this(o0iIl1, Ooo0Ioii0o0.I00iiO);
                    if (o0iIl1 != null) {
                    } else {
/* 34 */                I0000oI00(2);
                        throw null;
                    }
                }
            }
