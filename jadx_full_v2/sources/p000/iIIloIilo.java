            package p000;

            import android.os.Binder;
            import android.os.Parcelable;
            import android.util.Size;
            import android.util.SizeF;
            import android.util.SparseArray;
            import java.io.Serializable;
            
            public abstract class iIIloIilo {
                public static final Class[] I00000oIO = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

                public static final boolean I00000oIO(Object obj) {
/* 4 */             if (obj instanceof Ol1ll0O) {
/* 6 */                 Ol1ll0O ol1ll0O = (Ol1ll0O) obj;
/* 14 */                if (ol1ll0O.I0000oI00() == IIIOlol.I00ilO0 || ol1ll0O.I0000oI00() == Io1Oioii1111.I00ilO0 || ol1ll0O.I0000oI00() == IOO0o0I1l.I00ilI0I1) {
/* 32 */                    Object value = ol1ll0O.getValue();
/* 36 */                    if (value == null) {
/* 67 */                        return true;
                            }
/* 39 */                    return I00000oIO(value);
                        }
                    } else if (!(obj instanceof IlliIlI) || !(obj instanceof Serializable)) {
/* 55 */                for (int i = 0; i < 7; i++) {
/* 65 */                    if (I00000oIO[i].isInstance(obj)) {
/* 67 */                        return true;
                            }
                        }
                    }
/* 3 */             return false;
                }
            }
