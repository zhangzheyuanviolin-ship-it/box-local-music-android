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
            public final class i11oIoi1 {
                public static final i11oIoi1 I00iiO;
                public static final i11oIoi1 I00iio;
                public static final i11oIoi1 I00ilI0I1;
                public static final i11oIoi1 I00ilO0;
                public static final i11oIoi1[] I00io1l;
                public final i11oO1 I00iOIl;
                public final int I00iiI;

                i11oIoi1 EF1;

                i11oIoi1 EF2;

                i11oIoi1 EF0;

                static {
/* 9 */             i11oIoi1 i11oioi1 = new i11oIoi1("DOUBLE", 0, i11oO1.I00iio, 1);
/* 19 */            i11oIoi1 i11oioi12 = new i11oIoi1("FLOAT", 1, i11oO1.I00iiO, 5);
/* 24 */            i11oO1 i11oo1 = i11oO1.I00iiI;
/* 29 */            i11oIoi1 i11oioi13 = new i11oIoi1("INT64", 2, i11oo1, 0);
/* 37 */            i11oIoi1 i11oioi14 = new i11oIoi1("UINT64", 3, i11oo1, 0);
/* 42 */            i11oO1 i11oo12 = i11oO1.I00iOIl;
/* 47 */            i11oIoi1 i11oioi15 = new i11oIoi1("INT32", 4, i11oo12, 0);
/* 50 */            I00iiO = i11oioi15;
/* 56 */            i11oIoi1 i11oioi16 = new i11oIoi1("FIXED64", 5, i11oo1, 1);
/* 65 */            i11oIoi1 i11oioi17 = new i11oIoi1("FIXED32", 6, i11oo12, 5);
/* 75 */            i11oIoi1 i11oioi18 = new i11oIoi1("BOOL", 7, i11oO1.I00ilI0I1, 0);
/* 87 */            i11oIoi1 i11oioi19 = new i11oIoi1("STRING", 8, i11oO1.I00ilO0, 2);
/* 90 */            I00iio = i11oioi19;
/* 94 */            i11oO1 i11oo13 = i11oO1.I00l0I0l0lO1;
/* 100 */           i11oIoi1 i11oioi110 = new i11oIoi1("GROUP", 9, i11oo13, 3);
/* 103 */           I00ilI0I1 = i11oioi110;
/* 114 */           i11oIoi1 i11oioi111 = new i11oIoi1("MESSAGE", 10, i11oo13, 2);
/* 117 */           I00ilO0 = i11oioi111;
/* 224 */           I00io1l = new i11oIoi1[]{i11oioi1, i11oioi12, i11oioi13, i11oioi14, i11oioi15, i11oioi16, i11oioi17, i11oioi18, i11oioi19, i11oioi110, i11oioi111, new i11oIoi1("BYTES", 11, i11oO1.I00io1l, 2), new i11oIoi1("UINT32", 12, i11oo12, 0), new i11oIoi1("ENUM", 13, i11oO1.I00ioIO, 0), new i11oIoi1("SFIXED32", 14, i11oo12, 5), new i11oIoi1("SFIXED64", 15, i11oo1, 1), new i11oIoi1("SINT32", 16, i11oo12, 0), new i11oIoi1("SINT64", 17, i11oo1, 0)};
                }

                public i11oIoi1(String str, int i, i11oO1 i11oo1, int i2) {
/* 4 */             this.I00iOIl = i11oo1;
/* 6 */             this.I00iiI = i2;
                }

                public static i11oIoi1[] values() {
/* 7 */             return (i11oIoi1[]) I00io1l.clone();
                }
            }
