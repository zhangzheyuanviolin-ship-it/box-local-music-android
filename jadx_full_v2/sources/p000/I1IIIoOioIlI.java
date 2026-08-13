            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class I1IIIoOioIlI {
                public static final lolOiIoiillI I00iiO;
                public static final I1IIIoOioIlI I00iio;
                public static final I1IIIoOioIlI[] I00ilI0I1;
                public static final Il0li01oOil I00ilO0;
                public final String I00iOIl;
                public final String I00iiI;

                static {
/* 10 */            I1IIIoOioIlI i1IIIoOioIlI = new I1IIIoOioIlI(0, "SYSTEM", "", "System default");
/* 13 */            I00iio = i1IIIoOioIlI;
/* 63 */            I1IIIoOioIlI[] i1IIIoOioIlIArr = {i1IIIoOioIlI, new I1IIIoOioIlI(1, "ENGLISH", "en", "English"), new I1IIIoOioIlI(2, "FRENCH", "fr", "Français"), new I1IIIoOioIlI(3, "PORTUGUESE", "pt", "Português"), new I1IIIoOioIlI(4, "PORTUGUESE_BR", "pt-BR", "Português (Brasil)")};
/* 67 */            I00ilI0I1 = i1IIIoOioIlIArr;
/* 73 */            I00ilO0 = ilIII1o11.I00000oIO(i1IIIoOioIlIArr);
/* 82 */            I00iiO = new lolOiIoiillI(8);
                }

                public I1IIIoOioIlI(int i, String str, String str2, String str3) {
/* 4 */             this.I00iOIl = str2;
/* 6 */             this.I00iiI = str3;
                }

                public static I1IIIoOioIlI valueOf(String str) {
/* 7 */             return (I1IIIoOioIlI) Enum.valueOf(I1IIIoOioIlI.class, str);
                }

                public static I1IIIoOioIlI[] values() {
/* 7 */             return (I1IIIoOioIlI[]) I00ilI0I1.clone();
                }
            }
