            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Set;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OOIil01OI {
                public static final Set I00ilI0I1;
                public static final OOIil01OI I00ilO0;
                public static final OOIil01OI I00io1l;
                public static final OOIil01OI I00ioIO;
                public static final OOIil01OI I00l0I0l0lO1;
                public static final OOIil01OI I00l0OO0IO;
                public static final OOIil01OI I00li1OI;
                public static final OOIil01OI I00ll1;
                public static final OOIil01OI I00lli11;
                public static final OOIil01OI[] I00lll10;
                public final OI1Iio0ii1 I00iOIl;
                public final OI1Iio0ii1 I00iiI;
                public final O0ioIllo0i1 I00iiO;
                public final O0ioIllo0i1 I00iio;

                static {
/* 8 */             OOIil01OI oOIil01OI = new OOIil01OI("BOOLEAN", 0, "Boolean");
/* 11 */            I00ilO0 = oOIil01OI;
/* 20 */            OOIil01OI oOIil01OI2 = new OOIil01OI("CHAR", 1, "Char");
/* 23 */            I00io1l = oOIil01OI2;
/* 32 */            OOIil01OI oOIil01OI3 = new OOIil01OI("BYTE", 2, "Byte");
/* 35 */            I00ioIO = oOIil01OI3;
/* 44 */            OOIil01OI oOIil01OI4 = new OOIil01OI("SHORT", 3, "Short");
/* 47 */            I00l0I0l0lO1 = oOIil01OI4;
/* 56 */            OOIil01OI oOIil01OI5 = new OOIil01OI("INT", 4, "Int");
/* 59 */            I00l0OO0IO = oOIil01OI5;
/* 68 */            OOIil01OI oOIil01OI6 = new OOIil01OI("FLOAT", 5, "Float");
/* 71 */            I00li1OI = oOIil01OI6;
/* 80 */            OOIil01OI oOIil01OI7 = new OOIil01OI("LONG", 6, "Long");
/* 83 */            I00ll1 = oOIil01OI7;
/* 92 */            OOIil01OI oOIil01OI8 = new OOIil01OI("DOUBLE", 7, OIllioIilO.I0111i);
/* 95 */            I00lli11 = oOIil01OI8;
/* 97 */            OOIil01OI[] oOIil01OIArr = {oOIil01OI, oOIil01OI2, oOIil01OI3, oOIil01OI4, oOIil01OI5, oOIil01OI6, oOIil01OI7, oOIil01OI8};
/* 101 */           I00lll10 = oOIil01OIArr;
/* 103 */           ilIII1o11.I00000oIO(oOIil01OIArr);
/* 121 */           I00ilI0I1 = I1IoiO1l.I00IlilI0i0i(new OOIil01OI[]{oOIil01OI2, oOIil01OI3, oOIil01OI4, oOIil01OI5, oOIil01OI6, oOIil01OI7, oOIil01OI8});
                }

                public OOIil01OI(String str, int i, String str2) {
/* 8 */             this.I00iOIl = OI1Iio0ii1.I0000oI00(str2);
/* 20 */            this.I00iiI = OI1Iio0ii1.I0000oI00(str2.concat("Array"));
/* 22 */            O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iOIl;
/* 27 */            OOIiioo oOIiioo = new OOIiioo(0);
/* 30 */            oOIiioo.I00iiI = this;
/* 32 */            VarHandle.storeStoreFence();
/* 39 */            this.I00iiO = l0oi0lOi11i.I00000oIO(o0oI01I0oo, oOIiioo);
/* 44 */            OOIiioo oOIiioo2 = new OOIiioo(1);
/* 47 */            oOIiioo2.I00iiI = this;
/* 49 */            VarHandle.storeStoreFence();
/* 56 */            this.I00iio = l0oi0lOi11i.I00000oIO(o0oI01I0oo, oOIiioo2);
                }

                public static OOIil01OI valueOf(String str) {
/* 7 */             return (OOIil01OI) Enum.valueOf(OOIil01OI.class, str);
                }

                public static OOIil01OI[] values() {
/* 7 */             return (OOIil01OI[]) I00lll10.clone();
                }
            }
