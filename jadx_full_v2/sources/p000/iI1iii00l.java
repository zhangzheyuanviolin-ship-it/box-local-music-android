            package p000;
            
            /* JADX WARN: Enum visitor error
            jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
            	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
            	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
            	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
            	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
            	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
            	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
             */
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            public final class iI1iii00l {
                public static final iI1iii00l I00iiO;
                public static final iI1iii00l I00iio;
                public static final iI1iii00l I00ilI0I1;
                public static final iI1iii00l[] I00ilO0;
                public final iI1ilOliIi I00iOIl;
                public final int I00iiI;

                iI1iii00l EF1;

                iI1iii00l EF2;

                iI1iii00l EF0;

                static {
/* 9 */             iI1iii00l ii1iii00l = new iI1iii00l("DOUBLE", 0, iI1ilOliIi.I00iio, 1);
/* 19 */            iI1iii00l ii1iii00l2 = new iI1iii00l("FLOAT", 1, iI1ilOliIi.I00iiO, 5);
/* 24 */            iI1ilOliIi ii1iloliii = iI1ilOliIi.I00iiI;
/* 29 */            iI1iii00l ii1iii00l3 = new iI1iii00l("INT64", 2, ii1iloliii, 0);
/* 37 */            iI1iii00l ii1iii00l4 = new iI1iii00l("UINT64", 3, ii1iloliii, 0);
/* 42 */            iI1ilOliIi ii1iloliii2 = iI1ilOliIi.I00iOIl;
/* 47 */            iI1iii00l ii1iii00l5 = new iI1iii00l("INT32", 4, ii1iloliii2, 0);
/* 54 */            iI1iii00l ii1iii00l6 = new iI1iii00l("FIXED64", 5, ii1iloliii, 1);
/* 63 */            iI1iii00l ii1iii00l7 = new iI1iii00l("FIXED32", 6, ii1iloliii2, 5);
/* 73 */            iI1iii00l ii1iii00l8 = new iI1iii00l("BOOL", 7, iI1ilOliIi.I00ilI0I1, 0);
/* 85 */            iI1iii00l ii1iii00l9 = new iI1iii00l("STRING", 8, iI1ilOliIi.I00ilO0, 2);
/* 88 */            I00iiO = ii1iii00l9;
/* 92 */            iI1ilOliIi ii1iloliii3 = iI1ilOliIi.I00l0I0l0lO1;
/* 98 */            iI1iii00l ii1iii00l10 = new iI1iii00l("GROUP", 9, ii1iloliii3, 3);
/* 101 */           I00iio = ii1iii00l10;
/* 112 */           iI1iii00l ii1iii00l11 = new iI1iii00l("MESSAGE", 10, ii1iloliii3, 2);
/* 115 */           I00ilI0I1 = ii1iii00l11;
/* 222 */           I00ilO0 = new iI1iii00l[]{ii1iii00l, ii1iii00l2, ii1iii00l3, ii1iii00l4, ii1iii00l5, ii1iii00l6, ii1iii00l7, ii1iii00l8, ii1iii00l9, ii1iii00l10, ii1iii00l11, new iI1iii00l("BYTES", 11, iI1ilOliIi.I00io1l, 2), new iI1iii00l("UINT32", 12, ii1iloliii2, 0), new iI1iii00l("ENUM", 13, iI1ilOliIi.I00ioIO, 0), new iI1iii00l("SFIXED32", 14, ii1iloliii2, 5), new iI1iii00l("SFIXED64", 15, ii1iloliii, 1), new iI1iii00l("SINT32", 16, ii1iloliii2, 0), new iI1iii00l("SINT64", 17, ii1iloliii, 0)};
                }

                public iI1iii00l(String str, int i, iI1ilOliIi ii1iloliii, int i2) {
/* 4 */             this.I00iOIl = ii1iloliii;
/* 6 */             this.I00iiI = i2;
                }

                public static iI1iii00l[] values() {
/* 7 */             return (iI1iii00l[]) I00ilO0.clone();
                }
            }
