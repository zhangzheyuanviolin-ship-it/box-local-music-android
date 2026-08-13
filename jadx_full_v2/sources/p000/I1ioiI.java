            package p000;

            import android.hardware.camera2.CaptureRequest;
            import java.lang.invoke.VarHandle;
            
            public final class I1ioiI {
                public String I00000oIO;
                public Class I00000oOI;
                public Object I0000Il00O;

                public static I1ioiI I00000oIO(String str, Class cls, CaptureRequest.Key key) {
/* 3 */             I1ioiI i1ioiI = new I1ioiI();
/* 6 */             i1ioiI.I00000oIO = str;
/* 8 */             if (cls == null) {
/* 20 */                IOOlIIilOl0.I000II("Null valueClass");
/* 23 */                return null;
                    }
/* 10 */            i1ioiI.I00000oOI = cls;
/* 12 */            i1ioiI.I0000Il00O = key;
/* 14 */            VarHandle.storeStoreFence();
/* 17 */            return i1ioiI;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof I1ioiI) {
/* 10 */                I1ioiI i1ioiI = (I1ioiI) obj;
/* 20 */                if (this.I00000oIO.equals(i1ioiI.I00000oIO) && this.I00000oOI.equals(i1ioiI.I00000oOI)) {
/* 32 */                    Object obj2 = this.I0000Il00O;
/* 34 */                    Object obj3 = i1ioiI.I0000Il00O;
/* 36 */                    if (obj2 != null ? obj2.equals(obj3) : obj3 == null) {
/* 1 */                         return true;
                            }
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 19 */            int iHashCode = (((this.I00000oIO.hashCode() ^ 1000003) * 1000003) ^ this.I00000oOI.hashCode()) * 1000003;
/* 20 */            Object obj = this.I0000Il00O;
/* 30 */            return (obj == null ? 0 : obj.hashCode()) ^ iHashCode;
                }

                public final String toString() {
/* 38 */            return "Option{id=" + this.I00000oIO + ", valueClass=" + this.I00000oOI + ", token=" + this.I0000Il00O + "}";
                }
            }
