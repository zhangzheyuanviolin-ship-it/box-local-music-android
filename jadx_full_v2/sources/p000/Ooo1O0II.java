            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            public final class Ooo1O0II extends Ooo1l00l implements Iterable, O0IlIoi {
                public String I00iOIl;
                public float I00iiI;
                public float I00iiO;
                public float I00iio;
                public float I00ilI0I1;
                public float I00ilO0;
                public float I00io1l;
                public float I00ioIO;
                public List I00l0I0l0lO1;
                public ArrayList I00l0OO0IO;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 102 */               return true;
                    }
/* 4 */             if (obj == null || !(obj instanceof Ooo1O0II)) {
/* 104 */               return false;
                    }
/* 13 */            Ooo1O0II ooo1O0II = (Ooo1O0II) obj;
                    return O0000Ioio00.I0000O(this.I00iOIl, ooo1O0II.I00iOIl) && this.I00iiI == ooo1O0II.I00iiI && this.I00iiO == ooo1O0II.I00iiO && this.I00iio == ooo1O0II.I00iio && this.I00ilI0I1 == ooo1O0II.I00ilI0I1 && this.I00ilO0 == ooo1O0II.I00ilO0 && this.I00io1l == ooo1O0II.I00io1l && this.I00ioIO == ooo1O0II.I00ioIO && O0000Ioio00.I0000O(this.I00l0I0l0lO1, ooo1O0II.I00l0I0l0lO1) && this.I00l0OO0IO.equals(ooo1O0II.I00l0OO0IO);
                }

                public final int hashCode() {
/* 64 */            return this.I00l0OO0IO.hashCode() + IIl001iO0Io.I0000oI00(OooioIOo1.I0000O(OooioIOo1.I0000O(OooioIOo1.I0000O(OooioIOo1.I0000O(OooioIOo1.I0000O(OooioIOo1.I0000O(OooioIOo1.I0000O(this.I00iOIl.hashCode() * 31, 31, this.I00iiI), 31, this.I00iiO), 31, this.I00iio), 31, this.I00ilI0I1), 31, this.I00ilO0), 31, this.I00io1l), 31, this.I00ioIO), 31, this.I00l0I0l0lO1);
                }

                @Override
                public final Iterator iterator() {
/* 4 */             OO0o1ooIIi oO0o1ooIIi = new OO0o1ooIIi(2);
/* 13 */            oO0o1ooIIi.I00iiI = this.I00l0OO0IO.iterator();
/* 15 */            VarHandle.storeStoreFence();
/* 20 */            return oO0o1ooIIi;
                }
            }
