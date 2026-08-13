            package p000;

            import android.graphics.Matrix;
            import java.lang.invoke.VarHandle;
            
            public final class I1l0l0 implements IoiIIlOol1 {
                public Olo0o1II0 I00000oIO;
                public long I00000oOI;
                public int I0000Il00O;
                public Matrix I0000O;
                public int I0000oI00;

                public static I1l0l0 I0001Ioi1lo(Olo0o1II0 olo0o1II0, long j, int i, Matrix matrix, int i2) {
/* 3 */             I1l0l0 i1l0l0 = new I1l0l0();
/* 7 */             if (olo0o1II0 == null) {
/* 33 */                IOOlIIilOl0.I000II("Null tagBundle");
/* 6 */                 return null;
                    }
/* 9 */             i1l0l0.I00000oIO = olo0o1II0;
/* 11 */            i1l0l0.I00000oOI = j;
/* 13 */            i1l0l0.I0000Il00O = i;
/* 15 */            if (matrix == null) {
/* 27 */                IOOlIIilOl0.I000II("Null sensorToBufferTransformMatrix");
/* 6 */                 return null;
                    }
/* 17 */            i1l0l0.I0000O = matrix;
/* 19 */            i1l0l0.I0000oI00 = i2;
/* 21 */            VarHandle.storeStoreFence();
/* 24 */            return i1l0l0;
                }

                @Override
                public final void I00000oIO(Il1IIOoI il1IIOoI) {
/* 3 */             il1IIOoI.I0000O(this.I0000Il00O);
                }

                @Override
                public final Olo0o1II0 I00000oOI() {
/* 1 */             return this.I00000oIO;
                }

                @Override
                public final int I0000Il00O() {
/* 1 */             return this.I0000Il00O;
                }

                @Override
                public final int I0000O() {
/* 1 */             return this.I0000oI00;
                }

                @Override
                public final long I0000oI00() {
/* 1 */             return this.I00000oOI;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof I1l0l0) {
/* 10 */                I1l0l0 i1l0l0 = (I1l0l0) obj;
/* 20 */                if (this.I00000oIO.equals(i1l0l0.I00000oIO) && this.I00000oOI == i1l0l0.I00000oOI && this.I0000Il00O == i1l0l0.I0000Il00O && this.I0000O.equals(i1l0l0.I0000O) && this.I0000oI00 == i1l0l0.I0000oI00) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 11 */            int iHashCode = (this.I00000oIO.hashCode() ^ 1000003) * 1000003;
/* 12 */            long j = this.I00000oOI;
/* 36 */            return this.I0000oI00 ^ ((((((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.I0000Il00O) * 1000003) ^ this.I0000O.hashCode()) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("ImmutableImageInfo{tagBundle=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", timestamp=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", rotationDegrees=");
/* 30 */            sb.append(this.I0000Il00O);
/* 35 */            sb.append(", sensorToBufferTransformMatrix=");
/* 40 */            sb.append(this.I0000O);
/* 45 */            sb.append(", flashState=");
/* 52 */            return IIl001iO0Io.I000lI(this.I0000oI00, "}", sb);
                }
            }
