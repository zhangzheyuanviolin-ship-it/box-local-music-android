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
            public final class IlIOlI1iOi0O {
                public static final IlIOlI1iOi0O I00iiI;
                public static final IlIOlI1iOi0O I00iiO;
                public static final IlIOlI1iOi0O[] I00iio;
                public static final IlIOlI1iOi0O[] I00ilI0I1;
                public final int I00iOIl;

                IlIOlI1iOi0O EF0;

                static {
/* 3 */             O00oOoll011 o00oOoll011 = O00oOoll011.DOUBLE;
/* 12 */            IlIOlI1iOi0O ilIOlI1iOi0O = new IlIOlI1iOi0O("DOUBLE", 0, 0, 1, o00oOoll011);
/* 17 */            O00oOoll011 o00oOoll0112 = O00oOoll011.FLOAT;
/* 26 */            IlIOlI1iOi0O ilIOlI1iOi0O2 = new IlIOlI1iOi0O("FLOAT", 1, 1, 1, o00oOoll0112);
/* 33 */            O00oOoll011 o00oOoll0113 = O00oOoll011.LONG;
/* 42 */            IlIOlI1iOi0O ilIOlI1iOi0O3 = new IlIOlI1iOi0O("INT64", 2, 2, 1, o00oOoll0113);
/* 54 */            IlIOlI1iOi0O ilIOlI1iOi0O4 = new IlIOlI1iOi0O("UINT64", 3, 3, 1, o00oOoll0113);
/* 61 */            O00oOoll011 o00oOoll0114 = O00oOoll011.INT;
/* 70 */            IlIOlI1iOi0O ilIOlI1iOi0O5 = new IlIOlI1iOi0O("INT32", 4, 4, 1, o00oOoll0114);
/* 83 */            IlIOlI1iOi0O ilIOlI1iOi0O6 = new IlIOlI1iOi0O("FIXED64", 5, 5, 1, o00oOoll0113);
/* 96 */            IlIOlI1iOi0O ilIOlI1iOi0O7 = new IlIOlI1iOi0O("FIXED32", 6, 6, 1, o00oOoll0114);
/* 103 */           O00oOoll011 o00oOoll0115 = O00oOoll011.BOOLEAN;
/* 111 */           IlIOlI1iOi0O ilIOlI1iOi0O8 = new IlIOlI1iOi0O("BOOL", 7, 7, 1, o00oOoll0115);
/* 118 */           O00oOoll011 o00oOoll0116 = O00oOoll011.STRING;
/* 128 */           IlIOlI1iOi0O ilIOlI1iOi0O9 = new IlIOlI1iOi0O("STRING", 8, 8, 1, o00oOoll0116);
/* 135 */           O00oOoll011 o00oOoll0117 = O00oOoll011.MESSAGE;
/* 145 */           IlIOlI1iOi0O ilIOlI1iOi0O10 = new IlIOlI1iOi0O("MESSAGE", 9, 9, 1, o00oOoll0117);
/* 152 */           O00oOoll011 o00oOoll0118 = O00oOoll011.BYTE_STRING;
/* 160 */           IlIOlI1iOi0O ilIOlI1iOi0O11 = new IlIOlI1iOi0O("BYTES", 10, 10, 1, o00oOoll0118);
/* 177 */           IlIOlI1iOi0O ilIOlI1iOi0O12 = new IlIOlI1iOi0O("UINT32", 11, 11, 1, o00oOoll0114);
/* 184 */           O00oOoll011 o00oOoll0119 = O00oOoll011.ENUM;
/* 194 */           IlIOlI1iOi0O ilIOlI1iOi0O13 = new IlIOlI1iOi0O("ENUM", 12, 12, 1, o00oOoll0119);
/* 209 */           IlIOlI1iOi0O ilIOlI1iOi0O14 = new IlIOlI1iOi0O("SFIXED32", 13, 13, 1, o00oOoll0114);
/* 224 */           IlIOlI1iOi0O ilIOlI1iOi0O15 = new IlIOlI1iOi0O("SFIXED64", 14, 14, 1, o00oOoll0113);
/* 241 */           IlIOlI1iOi0O ilIOlI1iOi0O16 = new IlIOlI1iOi0O("SINT32", 15, 15, 1, o00oOoll0114);
/* 256 */           IlIOlI1iOi0O ilIOlI1iOi0O17 = new IlIOlI1iOi0O("SINT64", 16, 16, 1, o00oOoll0113);
/* 271 */           IlIOlI1iOi0O ilIOlI1iOi0O18 = new IlIOlI1iOi0O("GROUP", 17, 17, 1, o00oOoll0117);
/* 286 */           IlIOlI1iOi0O ilIOlI1iOi0O19 = new IlIOlI1iOi0O("DOUBLE_LIST", 18, 18, 2, o00oOoll011);
/* 302 */           IlIOlI1iOi0O ilIOlI1iOi0O20 = new IlIOlI1iOi0O("FLOAT_LIST", 19, 19, 2, o00oOoll0112);
/* 314 */           IlIOlI1iOi0O ilIOlI1iOi0O21 = new IlIOlI1iOi0O("INT64_LIST", 20, 20, 2, o00oOoll0113);
/* 327 */           IlIOlI1iOi0O ilIOlI1iOi0O22 = new IlIOlI1iOi0O("UINT64_LIST", 21, 21, 2, o00oOoll0113);
/* 342 */           IlIOlI1iOi0O ilIOlI1iOi0O23 = new IlIOlI1iOi0O("INT32_LIST", 22, 22, 2, o00oOoll0114);
/* 355 */           IlIOlI1iOi0O ilIOlI1iOi0O24 = new IlIOlI1iOi0O("FIXED64_LIST", 23, 23, 2, o00oOoll0113);
/* 368 */           IlIOlI1iOi0O ilIOlI1iOi0O25 = new IlIOlI1iOi0O("FIXED32_LIST", 24, 24, 2, o00oOoll0114);
/* 385 */           IlIOlI1iOi0O ilIOlI1iOi0O26 = new IlIOlI1iOi0O("BOOL_LIST", 25, 25, 2, o00oOoll0115);
/* 402 */           IlIOlI1iOi0O ilIOlI1iOi0O27 = new IlIOlI1iOi0O("STRING_LIST", 26, 26, 2, o00oOoll0116);
/* 415 */           IlIOlI1iOi0O ilIOlI1iOi0O28 = new IlIOlI1iOi0O("MESSAGE_LIST", 27, 27, 2, o00oOoll0117);
/* 430 */           IlIOlI1iOi0O ilIOlI1iOi0O29 = new IlIOlI1iOi0O("BYTES_LIST", 28, 28, 2, o00oOoll0118);
/* 441 */           IlIOlI1iOi0O ilIOlI1iOi0O30 = new IlIOlI1iOi0O("UINT32_LIST", 29, 29, 2, o00oOoll0114);
/* 456 */           IlIOlI1iOi0O ilIOlI1iOi0O31 = new IlIOlI1iOi0O("ENUM_LIST", 30, 30, 2, o00oOoll0119);
/* 469 */           IlIOlI1iOi0O ilIOlI1iOi0O32 = new IlIOlI1iOi0O("SFIXED32_LIST", 31, 31, 2, o00oOoll0114);
/* 482 */           IlIOlI1iOi0O ilIOlI1iOi0O33 = new IlIOlI1iOi0O("SFIXED64_LIST", 32, 32, 2, o00oOoll0113);
/* 497 */           IlIOlI1iOi0O ilIOlI1iOi0O34 = new IlIOlI1iOi0O("SINT32_LIST", 33, 33, 2, o00oOoll0114);
/* 512 */           IlIOlI1iOi0O ilIOlI1iOi0O35 = new IlIOlI1iOi0O("SINT64_LIST", 34, 34, 2, o00oOoll0113);
/* 535 */           IlIOlI1iOi0O ilIOlI1iOi0O36 = new IlIOlI1iOi0O("DOUBLE_LIST_PACKED", 35, 35, 3, o00oOoll011);
/* 538 */           I00iiI = ilIOlI1iOi0O36;
/* 552 */           IlIOlI1iOi0O ilIOlI1iOi0O37 = new IlIOlI1iOi0O("FLOAT_LIST_PACKED", 36, 36, 3, o00oOoll0112);
/* 563 */           IlIOlI1iOi0O ilIOlI1iOi0O38 = new IlIOlI1iOi0O("INT64_LIST_PACKED", 37, 37, 3, o00oOoll0113);
/* 576 */           IlIOlI1iOi0O ilIOlI1iOi0O39 = new IlIOlI1iOi0O("UINT64_LIST_PACKED", 38, 38, 3, o00oOoll0113);
/* 593 */           IlIOlI1iOi0O ilIOlI1iOi0O40 = new IlIOlI1iOi0O("INT32_LIST_PACKED", 39, 39, 3, o00oOoll0114);
/* 606 */           IlIOlI1iOi0O ilIOlI1iOi0O41 = new IlIOlI1iOi0O("FIXED64_LIST_PACKED", 40, 40, 3, o00oOoll0113);
/* 619 */           IlIOlI1iOi0O ilIOlI1iOi0O42 = new IlIOlI1iOi0O("FIXED32_LIST_PACKED", 41, 41, 3, o00oOoll0114);
/* 637 */           IlIOlI1iOi0O ilIOlI1iOi0O43 = new IlIOlI1iOi0O("BOOL_LIST_PACKED", 42, 42, 3, o00oOoll0115);
/* 648 */           IlIOlI1iOi0O ilIOlI1iOi0O44 = new IlIOlI1iOi0O("UINT32_LIST_PACKED", 43, 43, 3, o00oOoll0114);
/* 665 */           IlIOlI1iOi0O ilIOlI1iOi0O45 = new IlIOlI1iOi0O("ENUM_LIST_PACKED", 44, 44, 3, o00oOoll0119);
/* 676 */           IlIOlI1iOi0O ilIOlI1iOi0O46 = new IlIOlI1iOi0O("SFIXED32_LIST_PACKED", 45, 45, 3, o00oOoll0114);
/* 691 */           IlIOlI1iOi0O ilIOlI1iOi0O47 = new IlIOlI1iOi0O("SFIXED64_LIST_PACKED", 46, 46, 3, o00oOoll0113);
/* 706 */           IlIOlI1iOi0O ilIOlI1iOi0O48 = new IlIOlI1iOi0O("SINT32_LIST_PACKED", 47, 47, 3, o00oOoll0114);
/* 717 */           IlIOlI1iOi0O ilIOlI1iOi0O49 = new IlIOlI1iOi0O("SINT64_LIST_PACKED", 48, 48, 3, o00oOoll0113);
/* 720 */           I00iiO = ilIOlI1iOi0O49;
/* 827 */           I00ilI0I1 = new IlIOlI1iOi0O[]{ilIOlI1iOi0O, ilIOlI1iOi0O2, ilIOlI1iOi0O3, ilIOlI1iOi0O4, ilIOlI1iOi0O5, ilIOlI1iOi0O6, ilIOlI1iOi0O7, ilIOlI1iOi0O8, ilIOlI1iOi0O9, ilIOlI1iOi0O10, ilIOlI1iOi0O11, ilIOlI1iOi0O12, ilIOlI1iOi0O13, ilIOlI1iOi0O14, ilIOlI1iOi0O15, ilIOlI1iOi0O16, ilIOlI1iOi0O17, ilIOlI1iOi0O18, ilIOlI1iOi0O19, ilIOlI1iOi0O20, ilIOlI1iOi0O21, ilIOlI1iOi0O22, ilIOlI1iOi0O23, ilIOlI1iOi0O24, ilIOlI1iOi0O25, ilIOlI1iOi0O26, ilIOlI1iOi0O27, ilIOlI1iOi0O28, ilIOlI1iOi0O29, ilIOlI1iOi0O30, ilIOlI1iOi0O31, ilIOlI1iOi0O32, ilIOlI1iOi0O33, ilIOlI1iOi0O34, ilIOlI1iOi0O35, ilIOlI1iOi0O36, ilIOlI1iOi0O37, ilIOlI1iOi0O38, ilIOlI1iOi0O39, ilIOlI1iOi0O40, ilIOlI1iOi0O41, ilIOlI1iOi0O42, ilIOlI1iOi0O43, ilIOlI1iOi0O44, ilIOlI1iOi0O45, ilIOlI1iOi0O46, ilIOlI1iOi0O47, ilIOlI1iOi0O48, ilIOlI1iOi0O49, new IlIOlI1iOi0O("GROUP_LIST", 49, 49, 2, o00oOoll0117), new IlIOlI1iOi0O("MAP", 50, 50, 4, O00oOoll011.VOID)};
/* 829 */           IlIOlI1iOi0O[] ilIOlI1iOi0OArrValues = values();
/* 836 */           I00iio = new IlIOlI1iOi0O[ilIOlI1iOi0OArrValues.length];
/* 840 */           for (IlIOlI1iOi0O ilIOlI1iOi0O50 : ilIOlI1iOi0OArrValues) {
/* 848 */               I00iio[ilIOlI1iOi0O50.I00iOIl] = ilIOlI1iOi0O50;
                    }
                }

                public IlIOlI1iOi0O(String str, int i, int i2, int i3, O00oOoll011 o00oOoll011) {
/* 4 */             this.I00iOIl = i2;
/* 6 */             int iI001lIiIIo1O = IIlIOloOOO.I001lIiIIo1O(i3);
/* 11 */            if (iI001lIiIIo1O == 1 || iI001lIiIIo1O == 3) {
/* 17 */                Class cls = o00oOoll011.I00iOIl;
                    }
/* 22 */            if (i3 == 1) {
/* 24 */                o00oOoll011.ordinal();
                    }
                }

                public static IlIOlI1iOi0O valueOf(String str) {
/* 7 */             return (IlIOlI1iOi0O) Enum.valueOf(IlIOlI1iOi0O.class, str);
                }

                public static IlIOlI1iOi0O[] values() {
/* 7 */             return (IlIOlI1iOi0O[]) I00ilI0I1.clone();
                }
            }
