            package p000;

            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.Parcelable;
            import android.util.Size;
            import android.util.SizeF;
            import java.io.Serializable;
            
            public abstract class iOiIOo1010i {
                public static final Bundle I00000oIO(OIoi0IIoi... oIoi0IIoiArr) {
/* 4 */             Bundle bundle = new Bundle(oIoi0IIoiArr.length);
/* 9 */             for (OIoi0IIoi oIoi0IIoi : oIoi0IIoiArr) {
/* 15 */                String str = (String) oIoi0IIoi.I00iOIl;
/* 17 */                Object obj = oIoi0IIoi.I00iiI;
/* 20 */                if (obj == null) {
/* 22 */                    bundle.putString(str, null);
                        } else if (obj instanceof Boolean) {
/* 37 */                    bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                        } else if (obj instanceof Byte) {
/* 52 */                    bundle.putByte(str, ((Number) obj).byteValue());
                        } else if (obj instanceof Character) {
/* 67 */                    bundle.putChar(str, ((Character) obj).charValue());
                        } else if (obj instanceof Double) {
/* 82 */                    bundle.putDouble(str, ((Number) obj).doubleValue());
                        } else if (obj instanceof Float) {
/* 97 */                    bundle.putFloat(str, ((Number) obj).floatValue());
                        } else if (obj instanceof Integer) {
/* 112 */                   bundle.putInt(str, ((Number) obj).intValue());
                        } else if (obj instanceof Long) {
/* 127 */                   bundle.putLong(str, ((Number) obj).longValue());
                        } else if (obj instanceof Short) {
/* 142 */                   bundle.putShort(str, ((Number) obj).shortValue());
                        } else if (obj instanceof Bundle) {
/* 153 */                   bundle.putBundle(str, (Bundle) obj);
                        } else if (obj instanceof CharSequence) {
/* 164 */                   bundle.putCharSequence(str, (CharSequence) obj);
                        } else if (obj instanceof Parcelable) {
/* 175 */                   bundle.putParcelable(str, (Parcelable) obj);
                        } else if (obj instanceof boolean[]) {
/* 186 */                   bundle.putBooleanArray(str, (boolean[]) obj);
                        } else if (obj instanceof byte[]) {
/* 197 */                   bundle.putByteArray(str, (byte[]) obj);
                        } else if (obj instanceof char[]) {
/* 208 */                   bundle.putCharArray(str, (char[]) obj);
                        } else if (obj instanceof double[]) {
/* 219 */                   bundle.putDoubleArray(str, (double[]) obj);
                        } else if (obj instanceof float[]) {
/* 230 */                   bundle.putFloatArray(str, (float[]) obj);
                        } else if (obj instanceof int[]) {
/* 241 */                   bundle.putIntArray(str, (int[]) obj);
                        } else if (obj instanceof long[]) {
/* 252 */                   bundle.putLongArray(str, (long[]) obj);
                        } else if (obj instanceof short[]) {
/* 263 */                   bundle.putShortArray(str, (short[]) obj);
                        } else if (obj instanceof Object[]) {
/* 280 */                   Class<?> componentType = obj.getClass().getComponentType();
/* 290 */                   if (Parcelable.class.isAssignableFrom(componentType)) {
/* 294 */                       bundle.putParcelableArray(str, (Parcelable[]) obj);
                            } else if (String.class.isAssignableFrom(componentType)) {
/* 308 */                       bundle.putStringArray(str, (String[]) obj);
                            } else if (CharSequence.class.isAssignableFrom(componentType)) {
/* 322 */                       bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                            } else {
/* 332 */                       if (!Serializable.class.isAssignableFrom(componentType)) {
/* 350 */                           I000II.I000iOII(Oi010OO0.I001IO000("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, "\""));
/* 19 */                            return null;
                                }
/* 336 */                       bundle.putSerializable(str, (Serializable) obj);
                            }
                        } else if (obj instanceof Serializable) {
/* 360 */                   bundle.putSerializable(str, (Serializable) obj);
                        } else if (obj instanceof IBinder) {
/* 370 */                   bundle.putBinder(str, (IBinder) obj);
                        } else if (obj instanceof Size) {
/* 380 */                   bundle.putSize(str, (Size) obj);
                        } else {
/* 386 */                   if (!(obj instanceof SizeF)) {
/* 411 */                       I000II.I000iOII(Oi010OO0.I001IO000("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, "\""));
/* 19 */                        return null;
                            }
/* 390 */                   bundle.putSizeF(str, (SizeF) obj);
                        }
                    }
/* 437 */           return bundle;
                }
            }
