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
            public final class o0ilooOIO0 {
                public static final o0ilooOIO0 I00iiI;
                public static final o0ilooOIO0 I00iiO;
                public static final o0ilooOIO0 I00iio;
                public static final o0ilooOIO0[] I00ilI0I1;
                public final o0iolO0OI I00iOIl;

                o0ilooOIO0 EF1;

                o0ilooOIO0 EF2;

                o0ilooOIO0 EF3;

                static {
/* 8 */             o0ilooOIO0 o0iloooio0 = new o0ilooOIO0("DOUBLE", 0, o0iolO0OI.I00iio);
/* 18 */            o0ilooOIO0 o0iloooio02 = new o0ilooOIO0("FLOAT", 1, o0iolO0OI.I00iiO);
/* 23 */            o0iolO0OI o0iolo0oi = o0iolO0OI.I00iiI;
/* 28 */            o0ilooOIO0 o0iloooio03 = new o0ilooOIO0("INT64", 2, o0iolo0oi);
/* 36 */            o0ilooOIO0 o0iloooio04 = new o0ilooOIO0("UINT64", 3, o0iolo0oi);
/* 41 */            o0iolO0OI o0iolo0oi2 = o0iolO0OI.I00iOIl;
/* 46 */            o0ilooOIO0 o0iloooio05 = new o0ilooOIO0("INT32", 4, o0iolo0oi2);
/* 54 */            o0ilooOIO0 o0iloooio06 = new o0ilooOIO0("FIXED64", 5, o0iolo0oi);
/* 63 */            o0ilooOIO0 o0iloooio07 = new o0ilooOIO0("FIXED32", 6, o0iolo0oi2);
/* 74 */            o0ilooOIO0 o0iloooio08 = new o0ilooOIO0("BOOL", 7, o0iolO0OI.I00ilI0I1);
/* 86 */            o0ilooOIO0 o0iloooio09 = new o0ilooOIO0("STRING", 8, o0iolO0OI.I00ilO0);
/* 92 */            o0iolO0OI o0iolo0oi3 = o0iolO0OI.I00l0I0l0lO1;
/* 98 */            o0ilooOIO0 o0iloooio010 = new o0ilooOIO0("GROUP", 9, o0iolo0oi3);
/* 101 */           I00iiI = o0iloooio010;
/* 110 */           o0ilooOIO0 o0iloooio011 = new o0ilooOIO0("MESSAGE", 10, o0iolo0oi3);
/* 113 */           I00iiO = o0iloooio011;
/* 125 */           o0ilooOIO0 o0iloooio012 = new o0ilooOIO0("BYTES", 11, o0iolO0OI.I00io1l);
/* 135 */           o0ilooOIO0 o0iloooio013 = new o0ilooOIO0("UINT32", 12, o0iolo0oi2);
/* 150 */           o0ilooOIO0 o0iloooio014 = new o0ilooOIO0("ENUM", 13, o0iolO0OI.I00ioIO);
/* 153 */           I00iio = o0iloooio014;
/* 213 */           I00ilI0I1 = new o0ilooOIO0[]{o0iloooio0, o0iloooio02, o0iloooio03, o0iloooio04, o0iloooio05, o0iloooio06, o0iloooio07, o0iloooio08, o0iloooio09, o0iloooio010, o0iloooio011, o0iloooio012, o0iloooio013, o0iloooio014, new o0ilooOIO0("SFIXED32", 14, o0iolo0oi2), new o0ilooOIO0("SFIXED64", 15, o0iolo0oi), new o0ilooOIO0("SINT32", 16, o0iolo0oi2), new o0ilooOIO0("SINT64", 17, o0iolo0oi)};
                }

                public o0ilooOIO0(String str, int i, o0iolO0OI o0iolo0oi) {
/* 4 */             this.I00iOIl = o0iolo0oi;
                }

                public static o0ilooOIO0[] values() {
/* 7 */             return (o0ilooOIO0[]) I00ilI0I1.clone();
                }
            }
