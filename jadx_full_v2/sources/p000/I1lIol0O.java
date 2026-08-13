            package p000;

            import android.graphics.Rect;
            import android.util.Size;
            import java.lang.invoke.VarHandle;
            
            public final class I1lIol0O {
                public Size I00000oIO;
                public Rect I00000oOI;
                public IIllOo0 I0000Il00O;
                public int I0000O;
                public boolean I0000oI00;

                public static I1lIol0O I00000oIO(Size size, Rect rect, IIllOo0 iIllOo0, int i, boolean z) {
/* 3 */             I1lIol0O i1lIol0O = new I1lIol0O();
/* 7 */             if (size == null) {
/* 33 */                IOOlIIilOl0.I000II("Null inputSize");
/* 6 */                 return null;
                    }
/* 9 */             i1lIol0O.I00000oIO = size;
/* 11 */            if (rect == null) {
/* 27 */                IOOlIIilOl0.I000II("Null inputCropRect");
/* 6 */                 return null;
                    }
/* 13 */            i1lIol0O.I00000oOI = rect;
/* 15 */            i1lIol0O.I0000Il00O = iIllOo0;
/* 17 */            i1lIol0O.I0000O = i;
/* 19 */            i1lIol0O.I0000oI00 = z;
/* 21 */            VarHandle.storeStoreFence();
/* 24 */            return i1lIol0O;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof I1lIol0O) {
/* 10 */                I1lIol0O i1lIol0O = (I1lIol0O) obj;
/* 20 */                if (this.I00000oIO.equals(i1lIol0O.I00000oIO) && this.I00000oOI.equals(i1lIol0O.I00000oOI)) {
/* 32 */                    IIllOo0 iIllOo0 = this.I0000Il00O;
/* 34 */                    IIllOo0 iIllOo02 = i1lIol0O.I0000Il00O;
/* 36 */                    if (iIllOo0 != null ? iIllOo0.equals(iIllOo02) : iIllOo02 == null) {
/* 51 */                        if (this.I0000O == i1lIol0O.I0000O && this.I0000oI00 == i1lIol0O.I0000oI00) {
/* 1 */                             return true;
                                }
                            }
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 19 */            int iHashCode = (((this.I00000oIO.hashCode() ^ 1000003) * 1000003) ^ this.I00000oOI.hashCode()) * 1000003;
/* 20 */            IIllOo0 iIllOo0 = this.I0000Il00O;
/* 45 */            return (this.I0000oI00 ? 1231 : 1237) ^ ((((iHashCode ^ (iIllOo0 == null ? 0 : iIllOo0.hashCode())) * 1000003) ^ this.I0000O) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("CameraInputInfo{inputSize=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", inputCropRect=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", cameraInternal=");
/* 30 */            sb.append(this.I0000Il00O);
/* 35 */            sb.append(", rotationDegrees=");
/* 40 */            sb.append(this.I0000O);
/* 45 */            sb.append(", mirroring=");
/* 52 */            return IIlIOloOOO.I0010o(sb, this.I0000oI00, "}");
                }
            }
