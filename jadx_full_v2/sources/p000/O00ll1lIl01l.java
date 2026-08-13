            package p000;

            import java.util.HashMap;
            
            public abstract class O00ll1lIl01l {
                public static final IiOiOloo0 I00000oIO;
                public static final IiOiOloo0 I00000oOI;
                public static final IiOiOloo0 I0000Il00O;
                public static final HashMap I0000O;

                static {
/* 3 */             O01010 o01010 = O01010.I00ilI0I1;
/* 7 */             IiOiOloo0 iiOiOloo0 = new IiOiOloo0(o01010, 9);
/* 10 */            I00000oIO = iiOiOloo0;
/* 14 */            O01010 o010102 = O01010.I00io1l;
/* 18 */            IiOiOloo0 iiOiOloo02 = new IiOiOloo0(o010102, 10);
/* 21 */            I00000oOI = iiOiOloo02;
/* 25 */            O01010 o010103 = O01010.I00ilO0;
/* 29 */            IiOiOloo0 iiOiOloo03 = new IiOiOloo0(o010103, 11);
/* 32 */            I0000Il00O = iiOiOloo03;
/* 36 */            HashMap map = new HashMap();
/* 39 */            I0000O = map;
/* 41 */            map.put(o01010, iiOiOloo0);
/* 44 */            map.put(o010102, iiOiOloo02);
/* 47 */            map.put(o010103, iiOiOloo03);
                }

                public static void I00000oIO(int i) {
/* 10 */            String str = (i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
/* 21 */            Object[] objArr = new Object[(i == 5 || i == 6) ? 2 : 3];
                    switch (i) {
                        case 1:
/* 54 */                    objArr[0] = "from";
                            break;
                        case 2:
/* 49 */                    objArr[0] = "first";
                            break;
                        case 3:
/* 44 */                    objArr[0] = "second";
                            break;
                        case 4:
/* 39 */                    objArr[0] = "visibility";
                            break;
                        case 5:
                        case 6:
/* 34 */                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                            break;
                        default:
/* 31 */                    objArr[0] = "what";
                            break;
                    }
/* 59 */            if (i == 5 || i == 6) {
/* 66 */                objArr[1] = "toDescriptorVisibility";
                    } else {
/* 63 */                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                    }
/* 68 */            if (i == 2 || i == 3) {
/* 89 */                objArr[2] = "areInSamePackage";
                    } else if (i == 4) {
/* 84 */                objArr[2] = "toDescriptorVisibility";
                    } else if (i != 5 && i != 6) {
/* 81 */                objArr[2] = "isVisibleForProtectedAndPackage";
                    }
/* 91 */            String str2 = String.format(str, objArr);
/* 95 */            if (i != 5 && i != 6) {
/* 110 */               throw new IllegalArgumentException(str2);
                    }
/* 110 */           throw new IllegalStateException(str2);
                }

                public static boolean I00000oOI(Ii1i0O0o ii1i0O0o, Ii1Ool1 ii1Ool1) {
/* 2 */             if (ii1i0O0o == null) {
/* 48 */                I00000oIO(2);
/* 89 */                throw null;
                    }
/* 4 */             if (ii1Ool1 == null) {
/* 43 */                I00000oIO(3);
/* 46 */                throw null;
                    }
/* 13 */            OIo0il oIo0il = (OIo0il) IiOiIO0i1Oil.I000O01llI0(ii1i0O0o, OIo0il.class, false);
/* 19 */            OIo0il oIo0il2 = (OIo0il) IiOiIO0i1Oil.I000O01llI0(ii1Ool1, OIo0il.class, false);
                    return (oIo0il2 == null || oIo0il == null || !((OIo0l0) oIo0il).I00ilI0I1.equals(((OIo0l0) oIo0il2).I00ilI0I1)) ? false : true;
                }

                public static boolean I0000Il00O(OOlo0i0 oOlo0i0, Ii1i0O0o ii1i0O0o, Ii1Ool1 ii1Ool1) {
                    Ii1i0O0o ii1i0O0oI0010I0i;
/* 2 */             if (ii1Ool1 == null) {
/* 33 */                I00000oIO(1);
/* 215 */               throw null;
                    }
/* 6 */             if (ii1i0O0o instanceof IIiO00o1o) {
/* 11 */                ii1i0O0oI0010I0i = IiOiIO0i1Oil.I0010I0i((IIiO00o1o) ii1i0O0o);
                    } else {
/* 16 */                int i = IiOiIO0i1Oil.I00000oIO;
/* 18 */                ii1i0O0oI0010I0i = ii1i0O0o;
                    }
/* 23 */            if (I00000oOI(ii1i0O0oI0010I0i, ii1Ool1)) {
/* 1 */                 return true;
                    }
/* 28 */            return IiOiioI.I0000Il00O.I00000oIO(oOlo0i0, ii1i0O0o, ii1Ool1);
                }
            }
