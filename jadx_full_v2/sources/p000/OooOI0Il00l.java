            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            
            public abstract class OooOI0Il00l {
                public I1Io0i0II I00000oIO;
                public I1Io0i0II I00000oOI;
                public I1Io0i0II I0000Il00O;

                public abstract OooOIIIO I00000oIO();

                public final Class I00000oOI(Class cls) throws ClassNotFoundException {
/* 1 */             I1Io0i0II i1Io0i0II = this.I0000Il00O;
/* 11 */            Class cls2 = (Class) i1Io0i0II.get(cls.getName());
/* 13 */            if (cls2 != null) {
/* 77 */                return cls2;
                    }
/* 40 */            Class<?> cls3 = Class.forName(Oi010OO0.I001IIilI0O(cls.getPackage().getName(), ".", cls.getSimpleName(), "Parcelizer"), false, cls.getClassLoader());
/* 48 */            i1Io0i0II.put(cls.getName(), cls3);
/* 77 */            return cls3;
                }

                public final Method I0000Il00O(String str) throws NoSuchMethodException, SecurityException {
/* 1 */             I1Io0i0II i1Io0i0II = this.I00000oIO;
/* 7 */             Method method = (Method) i1Io0i0II.get(str);
/* 9 */             if (method != null) {
/* 77 */                return method;
                    }
/* 11 */            System.currentTimeMillis();
/* 31 */            Method declaredMethod = Class.forName(str, true, OooOI0Il00l.class.getClassLoader()).getDeclaredMethod("read", OooOI0Il00l.class);
/* 35 */            i1Io0i0II.put(str, declaredMethod);
/* 77 */            return declaredMethod;
                }

                public final Method I0000O(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
/* 1 */             I1Io0i0II i1Io0i0II = this.I00000oOI;
/* 11 */            Method method = (Method) i1Io0i0II.get(cls.getName());
/* 13 */            if (method != null) {
/* 77 */                return method;
                    }
/* 15 */            Class clsI00000oOI = I00000oOI(cls);
/* 19 */            System.currentTimeMillis();
/* 30 */            Method declaredMethod = clsI00000oOI.getDeclaredMethod("write", cls, OooOI0Il00l.class);
/* 38 */            i1Io0i0II.put(cls.getName(), declaredMethod);
/* 41 */            return declaredMethod;
                }

                public abstract boolean I0000oI00(int i);

                public final Parcelable I0001Ioi1lo(Parcelable parcelable, int i) {
/* 5 */             if (!I0000oI00(i)) {
/* 7 */                 return parcelable;
                    }
/* 18 */            return ((OooOIIIO) this).I0000oI00.readParcelable(OooOIIIO.class.getClassLoader());
                }

                public final OooOO0O0Olo I000II() {
/* 6 */             String string = ((OooOIIIO) this).I0000oI00.readString();
/* 11 */            if (string == null) {
/* 10 */                return null;
                    }
                    try {
/* 30 */                return (OooOO0O0Olo) I0000Il00O(string).invoke(null, I00000oIO());
                    } catch (ClassNotFoundException e) {
/* 43 */                OIiilo1Ool0o.I000iOII("VersionedParcel encountered ClassNotFoundException", e);
/* 10 */                return null;
                    } catch (IllegalAccessException e2) {
/* 76 */                OIiilo1Ool0o.I000iOII("VersionedParcel encountered IllegalAccessException", e2);
/* 10 */                return null;
                    } catch (NoSuchMethodException e3) {
/* 49 */                OIiilo1Ool0o.I000iOII("VersionedParcel encountered NoSuchMethodException", e3);
/* 10 */                return null;
                    } catch (InvocationTargetException e4) {
/* 59 */                if (e4.getCause() instanceof RuntimeException) {
/* 73 */                    throw ((RuntimeException) e4.getCause());
                        }
/* 63 */                OIiilo1Ool0o.I000iOII("VersionedParcel encountered InvocationTargetException", e4);
/* 10 */                return null;
                    }
                }

                public abstract void I000O01llI0(int i);

                public final void I000OOo1O(OooOO0O0Olo oooOO0O0Olo) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
/* 2 */             if (oooOO0O0Olo == null) {
/* 8 */                 ((OooOIIIO) this).I0000oI00.writeString(null);
/* 11 */                return;
                    }
                    try {
/* 29 */                ((OooOIIIO) this).I0000oI00.writeString(I00000oOI(oooOO0O0Olo.getClass()).getName());
/* 32 */                OooOIIIO oooOIIIOI00000oIO = I00000oIO();
                        try {
/* 48 */                    I0000O(oooOO0O0Olo.getClass()).invoke(null, oooOO0O0Olo, oooOIIIOI00000oIO);
/* 51 */                    Parcel parcel = oooOIIIOI00000oIO.I0000oI00;
/* 53 */                    int i = oooOIIIOI00000oIO.I000OOo1O;
/* 55 */                    if (i >= 0) {
/* 59 */                        int i2 = oooOIIIOI00000oIO.I0000O.get(i);
/* 63 */                        int iDataPosition = parcel.dataPosition();
/* 69 */                        parcel.setDataPosition(i2);
/* 72 */                        parcel.writeInt(iDataPosition - i2);
/* 75 */                        parcel.setDataPosition(iDataPosition);
                            }
                        } catch (ClassNotFoundException e) {
/* 82 */                    OIiilo1Ool0o.I000iOII("VersionedParcel encountered ClassNotFoundException", e);
                        } catch (IllegalAccessException e2) {
/* 118 */                   OIiilo1Ool0o.I000iOII("VersionedParcel encountered IllegalAccessException", e2);
                        } catch (NoSuchMethodException e3) {
/* 89 */                    OIiilo1Ool0o.I000iOII("VersionedParcel encountered NoSuchMethodException", e3);
                        } catch (InvocationTargetException e4) {
/* 100 */                   if (e4.getCause() instanceof RuntimeException) {
/* 114 */                       throw ((RuntimeException) e4.getCause());
                            }
/* 104 */                   OIiilo1Ool0o.I000iOII("VersionedParcel encountered InvocationTargetException", e4);
                        }
                    } catch (ClassNotFoundException e5) {
/* 137 */               OIiilo1Ool0o.I000iOII(oooOO0O0Olo.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
                    }
                }
            }
