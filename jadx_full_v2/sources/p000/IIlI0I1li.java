            package p000;

            import java.util.ArrayList;
            
            public interface IIlI0I1li {
                default void I00000oIO(Il1IIOoI il1IIOoI) {
                    int i;
/* 1 */             ArrayList arrayList = il1IIOoI.I00000oIO;
/* 3 */             int iI0000O = I0000O();
/* 8 */             if (iI0000O == 1) {
/* 10 */                return;
                    }
/* 11 */            int iI001lIiIIo1O = IIlIOloOOO.I001lIiIIo1O(iI0000O);
/* 16 */            if (iI001lIiIIo1O == 1) {
/* 62 */                i = 32;
                    } else if (iI001lIiIIo1O == 2) {
/* 60 */                i = 0;
                    } else {
/* 22 */                if (iI001lIiIIo1O != 3) {
/* 54 */                    l11I11lO.I0000oI00("ExifData", "Unknown flash state: ".concat(iI0000O != 1 ? iI0000O != 2 ? iI0000O != 3 ? iI0000O != 4 ? "null" : "FIRED" : "READY" : "NONE" : "UNKNOWN"));
/* 57 */                    return;
                        }
/* 58 */                i = 1;
                    }
/* 66 */            if ((i & 1) == 1) {
/* 74 */                il1IIOoI.I0000Il00O("LightSource", String.valueOf(4), arrayList);
                    }
/* 83 */            il1IIOoI.I0000Il00O("Flash", String.valueOf(i), arrayList);
                }

                Olo0o1II0 I00000oOI();

                int I0000O();

                long I0000oI00();

                IIl1oi I0001Ioi1lo();

                IIl1lO0O I000OOo1O();

                IIl1lO0oO I000OiO();
            }
