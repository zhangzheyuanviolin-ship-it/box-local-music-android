            package p000;

            import java.util.Iterator;
            import java.util.Map;
            
            public abstract class Io000lII0l extends Ilooool1l0 implements O1lIi00l {
                public IlIO0iI10oI I00iiI = IlIO0iI10oI.I0000Il00O;
                public boolean I00iiO;

                public final void I0001Ioi1lo(Io000liOIo io000liOIo) {
                    Ol1Io01IOiO ol1Io01IOiO;
/* 3 */             if (!this.I00iiO) {
/* 11 */                this.I00iiI = this.I00iiI.clone();
/* 14 */                this.I00iiO = true;
                    }
/* 16 */            IlIO0iI10oI ilIO0iI10oI = this.I00iiI;
/* 18 */            IlIO0iI10oI ilIO0iI10oI2 = io000liOIo.I00iOIl;
/* 20 */            ilIO0iI10oI.getClass();
/* 23 */            int i = 0;
                    while (true) {
/* 28 */                int size = ilIO0iI10oI2.I00000oIO.I00iiI.size();
/* 32 */                ol1Io01IOiO = ilIO0iI10oI2.I00000oIO;
/* 34 */                if (i >= size) {
                            break;
                        }
/* 44 */                ilIO0iI10oI.I000II((Map.Entry) ol1Io01IOiO.I00iiI.get(i));
/* 47 */                i++;
                    }
/* 54 */            Iterator it = ol1Io01IOiO.I0000Il00O().iterator();
/* 62 */            while (it.hasNext()) {
/* 70 */                ilIO0iI10oI.I000II((Map.Entry) it.next());
                    }
                }
            }
