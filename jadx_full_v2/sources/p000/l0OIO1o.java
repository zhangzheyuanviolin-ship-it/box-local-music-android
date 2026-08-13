            package p000;
            
            /* JADX WARN: Enum visitor error
            jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF3' uses external variables
            	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
            	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
            	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
            	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
            	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
            	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
             */
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            public final class l0OIO1o {
                public static final l0OIO1o I00iiI;
                public static final l0OIO1o I00iiO;
                public static final l0OIO1o I00iio;
                public static final l0OIO1o[] I00ilI0I1;
                public final l0OOi0lo I00iOIl;

                l0OIO1o EF1;

                l0OIO1o EF2;

                l0OIO1o EF3;

                static {
/* 8 */             l0OIO1o l0oio1o = new l0OIO1o("DOUBLE", 0, l0OOi0lo.I00iio);
/* 18 */            l0OIO1o l0oio1o2 = new l0OIO1o("FLOAT", 1, l0OOi0lo.I00iiO);
/* 23 */            l0OOi0lo l0ooi0lo = l0OOi0lo.I00iiI;
/* 28 */            l0OIO1o l0oio1o3 = new l0OIO1o("INT64", 2, l0ooi0lo);
/* 36 */            l0OIO1o l0oio1o4 = new l0OIO1o("UINT64", 3, l0ooi0lo);
/* 41 */            l0OOi0lo l0ooi0lo2 = l0OOi0lo.I00iOIl;
/* 46 */            l0OIO1o l0oio1o5 = new l0OIO1o("INT32", 4, l0ooi0lo2);
/* 54 */            l0OIO1o l0oio1o6 = new l0OIO1o("FIXED64", 5, l0ooi0lo);
/* 63 */            l0OIO1o l0oio1o7 = new l0OIO1o("FIXED32", 6, l0ooi0lo2);
/* 74 */            l0OIO1o l0oio1o8 = new l0OIO1o("BOOL", 7, l0OOi0lo.I00ilI0I1);
/* 86 */            l0OIO1o l0oio1o9 = new l0OIO1o("STRING", 8, l0OOi0lo.I00ilO0);
/* 92 */            l0OOi0lo l0ooi0lo3 = l0OOi0lo.I00l0I0l0lO1;
/* 98 */            l0OIO1o l0oio1o10 = new l0OIO1o("GROUP", 9, l0ooi0lo3);
/* 101 */           I00iiI = l0oio1o10;
/* 110 */           l0OIO1o l0oio1o11 = new l0OIO1o("MESSAGE", 10, l0ooi0lo3);
/* 113 */           I00iiO = l0oio1o11;
/* 125 */           l0OIO1o l0oio1o12 = new l0OIO1o("BYTES", 11, l0OOi0lo.I00io1l);
/* 135 */           l0OIO1o l0oio1o13 = new l0OIO1o("UINT32", 12, l0ooi0lo2);
/* 150 */           l0OIO1o l0oio1o14 = new l0OIO1o("ENUM", 13, l0OOi0lo.I00ioIO);
/* 153 */           I00iio = l0oio1o14;
/* 213 */           I00ilI0I1 = new l0OIO1o[]{l0oio1o, l0oio1o2, l0oio1o3, l0oio1o4, l0oio1o5, l0oio1o6, l0oio1o7, l0oio1o8, l0oio1o9, l0oio1o10, l0oio1o11, l0oio1o12, l0oio1o13, l0oio1o14, new l0OIO1o("SFIXED32", 14, l0ooi0lo2), new l0OIO1o("SFIXED64", 15, l0ooi0lo), new l0OIO1o("SINT32", 16, l0ooi0lo2), new l0OIO1o("SINT64", 17, l0ooi0lo)};
                }

                public l0OIO1o(String str, int i, l0OOi0lo l0ooi0lo) {
/* 4 */             this.I00iOIl = l0ooi0lo;
                }

                public static l0OIO1o[] values() {
/* 7 */             return (l0OIO1o[]) I00ilI0I1.clone();
                }
            }
