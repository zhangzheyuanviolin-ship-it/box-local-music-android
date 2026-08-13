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
            public final class IlIOio {
                public static final IlIOio I00iiI;
                public static final IlIOio I00iiO;
                public static final IlIOio[] I00iio;
                public static final IlIOio[] I00ilI0I1;
                public final int I00iOIl;

                IlIOio EF0;

                static {
/* 3 */             O00oOoOo o00oOoOo = O00oOoOo.DOUBLE;
/* 12 */            IlIOio ilIOio = new IlIOio("DOUBLE", 0, 0, 1, o00oOoOo);
/* 17 */            O00oOoOo o00oOoOo2 = O00oOoOo.FLOAT;
/* 26 */            IlIOio ilIOio2 = new IlIOio("FLOAT", 1, 1, 1, o00oOoOo2);
/* 33 */            O00oOoOo o00oOoOo3 = O00oOoOo.LONG;
/* 42 */            IlIOio ilIOio3 = new IlIOio("INT64", 2, 2, 1, o00oOoOo3);
/* 54 */            IlIOio ilIOio4 = new IlIOio("UINT64", 3, 3, 1, o00oOoOo3);
/* 61 */            O00oOoOo o00oOoOo4 = O00oOoOo.INT;
/* 70 */            IlIOio ilIOio5 = new IlIOio("INT32", 4, 4, 1, o00oOoOo4);
/* 83 */            IlIOio ilIOio6 = new IlIOio("FIXED64", 5, 5, 1, o00oOoOo3);
/* 96 */            IlIOio ilIOio7 = new IlIOio("FIXED32", 6, 6, 1, o00oOoOo4);
/* 103 */           O00oOoOo o00oOoOo5 = O00oOoOo.BOOLEAN;
/* 111 */           IlIOio ilIOio8 = new IlIOio("BOOL", 7, 7, 1, o00oOoOo5);
/* 118 */           O00oOoOo o00oOoOo6 = O00oOoOo.STRING;
/* 128 */           IlIOio ilIOio9 = new IlIOio("STRING", 8, 8, 1, o00oOoOo6);
/* 135 */           O00oOoOo o00oOoOo7 = O00oOoOo.MESSAGE;
/* 145 */           IlIOio ilIOio10 = new IlIOio("MESSAGE", 9, 9, 1, o00oOoOo7);
/* 152 */           O00oOoOo o00oOoOo8 = O00oOoOo.BYTE_STRING;
/* 160 */           IlIOio ilIOio11 = new IlIOio("BYTES", 10, 10, 1, o00oOoOo8);
/* 177 */           IlIOio ilIOio12 = new IlIOio("UINT32", 11, 11, 1, o00oOoOo4);
/* 184 */           O00oOoOo o00oOoOo9 = O00oOoOo.ENUM;
/* 194 */           IlIOio ilIOio13 = new IlIOio("ENUM", 12, 12, 1, o00oOoOo9);
/* 209 */           IlIOio ilIOio14 = new IlIOio("SFIXED32", 13, 13, 1, o00oOoOo4);
/* 224 */           IlIOio ilIOio15 = new IlIOio("SFIXED64", 14, 14, 1, o00oOoOo3);
/* 241 */           IlIOio ilIOio16 = new IlIOio("SINT32", 15, 15, 1, o00oOoOo4);
/* 256 */           IlIOio ilIOio17 = new IlIOio("SINT64", 16, 16, 1, o00oOoOo3);
/* 271 */           IlIOio ilIOio18 = new IlIOio("GROUP", 17, 17, 1, o00oOoOo7);
/* 286 */           IlIOio ilIOio19 = new IlIOio("DOUBLE_LIST", 18, 18, 2, o00oOoOo);
/* 302 */           IlIOio ilIOio20 = new IlIOio("FLOAT_LIST", 19, 19, 2, o00oOoOo2);
/* 314 */           IlIOio ilIOio21 = new IlIOio("INT64_LIST", 20, 20, 2, o00oOoOo3);
/* 327 */           IlIOio ilIOio22 = new IlIOio("UINT64_LIST", 21, 21, 2, o00oOoOo3);
/* 342 */           IlIOio ilIOio23 = new IlIOio("INT32_LIST", 22, 22, 2, o00oOoOo4);
/* 355 */           IlIOio ilIOio24 = new IlIOio("FIXED64_LIST", 23, 23, 2, o00oOoOo3);
/* 368 */           IlIOio ilIOio25 = new IlIOio("FIXED32_LIST", 24, 24, 2, o00oOoOo4);
/* 385 */           IlIOio ilIOio26 = new IlIOio("BOOL_LIST", 25, 25, 2, o00oOoOo5);
/* 402 */           IlIOio ilIOio27 = new IlIOio("STRING_LIST", 26, 26, 2, o00oOoOo6);
/* 415 */           IlIOio ilIOio28 = new IlIOio("MESSAGE_LIST", 27, 27, 2, o00oOoOo7);
/* 430 */           IlIOio ilIOio29 = new IlIOio("BYTES_LIST", 28, 28, 2, o00oOoOo8);
/* 441 */           IlIOio ilIOio30 = new IlIOio("UINT32_LIST", 29, 29, 2, o00oOoOo4);
/* 456 */           IlIOio ilIOio31 = new IlIOio("ENUM_LIST", 30, 30, 2, o00oOoOo9);
/* 469 */           IlIOio ilIOio32 = new IlIOio("SFIXED32_LIST", 31, 31, 2, o00oOoOo4);
/* 482 */           IlIOio ilIOio33 = new IlIOio("SFIXED64_LIST", 32, 32, 2, o00oOoOo3);
/* 497 */           IlIOio ilIOio34 = new IlIOio("SINT32_LIST", 33, 33, 2, o00oOoOo4);
/* 512 */           IlIOio ilIOio35 = new IlIOio("SINT64_LIST", 34, 34, 2, o00oOoOo3);
/* 535 */           IlIOio ilIOio36 = new IlIOio("DOUBLE_LIST_PACKED", 35, 35, 3, o00oOoOo);
/* 538 */           I00iiI = ilIOio36;
/* 552 */           IlIOio ilIOio37 = new IlIOio("FLOAT_LIST_PACKED", 36, 36, 3, o00oOoOo2);
/* 563 */           IlIOio ilIOio38 = new IlIOio("INT64_LIST_PACKED", 37, 37, 3, o00oOoOo3);
/* 576 */           IlIOio ilIOio39 = new IlIOio("UINT64_LIST_PACKED", 38, 38, 3, o00oOoOo3);
/* 593 */           IlIOio ilIOio40 = new IlIOio("INT32_LIST_PACKED", 39, 39, 3, o00oOoOo4);
/* 606 */           IlIOio ilIOio41 = new IlIOio("FIXED64_LIST_PACKED", 40, 40, 3, o00oOoOo3);
/* 619 */           IlIOio ilIOio42 = new IlIOio("FIXED32_LIST_PACKED", 41, 41, 3, o00oOoOo4);
/* 637 */           IlIOio ilIOio43 = new IlIOio("BOOL_LIST_PACKED", 42, 42, 3, o00oOoOo5);
/* 648 */           IlIOio ilIOio44 = new IlIOio("UINT32_LIST_PACKED", 43, 43, 3, o00oOoOo4);
/* 665 */           IlIOio ilIOio45 = new IlIOio("ENUM_LIST_PACKED", 44, 44, 3, o00oOoOo9);
/* 676 */           IlIOio ilIOio46 = new IlIOio("SFIXED32_LIST_PACKED", 45, 45, 3, o00oOoOo4);
/* 691 */           IlIOio ilIOio47 = new IlIOio("SFIXED64_LIST_PACKED", 46, 46, 3, o00oOoOo3);
/* 706 */           IlIOio ilIOio48 = new IlIOio("SINT32_LIST_PACKED", 47, 47, 3, o00oOoOo4);
/* 717 */           IlIOio ilIOio49 = new IlIOio("SINT64_LIST_PACKED", 48, 48, 3, o00oOoOo3);
/* 720 */           I00iiO = ilIOio49;
/* 827 */           I00ilI0I1 = new IlIOio[]{ilIOio, ilIOio2, ilIOio3, ilIOio4, ilIOio5, ilIOio6, ilIOio7, ilIOio8, ilIOio9, ilIOio10, ilIOio11, ilIOio12, ilIOio13, ilIOio14, ilIOio15, ilIOio16, ilIOio17, ilIOio18, ilIOio19, ilIOio20, ilIOio21, ilIOio22, ilIOio23, ilIOio24, ilIOio25, ilIOio26, ilIOio27, ilIOio28, ilIOio29, ilIOio30, ilIOio31, ilIOio32, ilIOio33, ilIOio34, ilIOio35, ilIOio36, ilIOio37, ilIOio38, ilIOio39, ilIOio40, ilIOio41, ilIOio42, ilIOio43, ilIOio44, ilIOio45, ilIOio46, ilIOio47, ilIOio48, ilIOio49, new IlIOio("GROUP_LIST", 49, 49, 2, o00oOoOo7), new IlIOio("MAP", 50, 50, 4, O00oOoOo.VOID)};
/* 829 */           IlIOio[] ilIOioArrValues = values();
/* 836 */           I00iio = new IlIOio[ilIOioArrValues.length];
/* 840 */           for (IlIOio ilIOio50 : ilIOioArrValues) {
/* 848 */               I00iio[ilIOio50.I00iOIl] = ilIOio50;
                    }
                }

                public IlIOio(String str, int i, int i2, int i3, O00oOoOo o00oOoOo) {
/* 4 */             this.I00iOIl = i2;
/* 6 */             int iI001lIiIIo1O = IIlIOloOOO.I001lIiIIo1O(i3);
/* 11 */            if (iI001lIiIIo1O == 1 || iI001lIiIIo1O == 3) {
/* 17 */                Class cls = o00oOoOo.I00iOIl;
                    }
/* 22 */            if (i3 == 1) {
/* 24 */                o00oOoOo.ordinal();
                    }
                }

                public static IlIOio valueOf(String str) {
/* 7 */             return (IlIOio) Enum.valueOf(IlIOio.class, str);
                }

                public static IlIOio[] values() {
/* 7 */             return (IlIOio[]) I00ilI0I1.clone();
                }
            }
