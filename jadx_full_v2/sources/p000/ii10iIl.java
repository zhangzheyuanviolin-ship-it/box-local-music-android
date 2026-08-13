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
            public final class ii10iIl {
                public static final ii10iIl I00iiO;
                public static final ii10iIl I00iio;
                public static final ii10iIl I00ilI0I1;
                public static final ii10iIl I00ilO0;
                public static final ii10iIl[] I00io1l;
                public final ii10l1 I00iOIl;
                public final int I00iiI;

                ii10iIl EF1;

                ii10iIl EF2;

                ii10iIl EF0;

                static {
/* 9 */             ii10iIl ii10iil = new ii10iIl("DOUBLE", 0, ii10l1.I00iio, 1);
/* 19 */            ii10iIl ii10iil2 = new ii10iIl("FLOAT", 1, ii10l1.I00iiO, 5);
/* 24 */            ii10l1 ii10l1Var = ii10l1.I00iiI;
/* 29 */            ii10iIl ii10iil3 = new ii10iIl("INT64", 2, ii10l1Var, 0);
/* 37 */            ii10iIl ii10iil4 = new ii10iIl("UINT64", 3, ii10l1Var, 0);
/* 42 */            ii10l1 ii10l1Var2 = ii10l1.I00iOIl;
/* 47 */            ii10iIl ii10iil5 = new ii10iIl("INT32", 4, ii10l1Var2, 0);
/* 50 */            I00iiO = ii10iil5;
/* 56 */            ii10iIl ii10iil6 = new ii10iIl("FIXED64", 5, ii10l1Var, 1);
/* 65 */            ii10iIl ii10iil7 = new ii10iIl("FIXED32", 6, ii10l1Var2, 5);
/* 75 */            ii10iIl ii10iil8 = new ii10iIl("BOOL", 7, ii10l1.I00ilI0I1, 0);
/* 87 */            ii10iIl ii10iil9 = new ii10iIl("STRING", 8, ii10l1.I00ilO0, 2);
/* 90 */            I00iio = ii10iil9;
/* 94 */            ii10l1 ii10l1Var3 = ii10l1.I00l0I0l0lO1;
/* 100 */           ii10iIl ii10iil10 = new ii10iIl("GROUP", 9, ii10l1Var3, 3);
/* 103 */           I00ilI0I1 = ii10iil10;
/* 114 */           ii10iIl ii10iil11 = new ii10iIl("MESSAGE", 10, ii10l1Var3, 2);
/* 117 */           I00ilO0 = ii10iil11;
/* 224 */           I00io1l = new ii10iIl[]{ii10iil, ii10iil2, ii10iil3, ii10iil4, ii10iil5, ii10iil6, ii10iil7, ii10iil8, ii10iil9, ii10iil10, ii10iil11, new ii10iIl("BYTES", 11, ii10l1.I00io1l, 2), new ii10iIl("UINT32", 12, ii10l1Var2, 0), new ii10iIl("ENUM", 13, ii10l1.I00ioIO, 0), new ii10iIl("SFIXED32", 14, ii10l1Var2, 5), new ii10iIl("SFIXED64", 15, ii10l1Var, 1), new ii10iIl("SINT32", 16, ii10l1Var2, 0), new ii10iIl("SINT64", 17, ii10l1Var, 0)};
                }

                public ii10iIl(String str, int i, ii10l1 ii10l1Var, int i2) {
/* 4 */             this.I00iOIl = ii10l1Var;
/* 6 */             this.I00iiI = i2;
                }

                public static ii10iIl[] values() {
/* 7 */             return (ii10iIl[]) I00io1l.clone();
                }
            }
