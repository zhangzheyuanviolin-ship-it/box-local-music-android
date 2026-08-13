            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Oo1IiOO1IoI {
                public static final Oo1IiOO1IoI I00iOIl;
                public static final Oo1IiOO1IoI I00iiI;
                public static final Oo1IiOO1IoI I00iiO;
                public static final Oo1IiOO1IoI[] I00iio;

                static {
/* 6 */             Oo1IiOO1IoI oo1IiOO1IoI = new Oo1IiOO1IoI("On", 0);
/* 9 */             I00iOIl = oo1IiOO1IoI;
/* 16 */            Oo1IiOO1IoI oo1IiOO1IoI2 = new Oo1IiOO1IoI("Off", 1);
/* 19 */            I00iiI = oo1IiOO1IoI2;
/* 26 */            Oo1IiOO1IoI oo1IiOO1IoI3 = new Oo1IiOO1IoI("Indeterminate", 2);
/* 29 */            I00iiO = oo1IiOO1IoI3;
/* 31 */            Oo1IiOO1IoI[] oo1IiOO1IoIArr = {oo1IiOO1IoI, oo1IiOO1IoI2, oo1IiOO1IoI3};
/* 35 */            I00iio = oo1IiOO1IoIArr;
/* 37 */            ilIII1o11.I00000oIO(oo1IiOO1IoIArr);
                }

                public static Oo1IiOO1IoI valueOf(String str) {
/* 7 */             return (Oo1IiOO1IoI) Enum.valueOf(Oo1IiOO1IoI.class, str);
                }

                public static Oo1IiOO1IoI[] values() {
/* 7 */             return (Oo1IiOO1IoI[]) I00iio.clone();
                }
            }
