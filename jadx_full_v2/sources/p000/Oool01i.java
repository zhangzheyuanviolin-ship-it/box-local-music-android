            package p000;

            import android.app.Application;
            import java.lang.reflect.InvocationTargetException;
            
            public final class Oool01i extends Oool0iIO {
                public static Oool01i I0000Il00O;
                public static final lo1iloiI1 I0000O = new lo1iloiI1(16);
                public final Application I00000oOI;

                public Oool01i(Application application) {
/* 4 */             this.I00000oOI = application;
                }

                public static OooioIIoi0O I0000O(Class cls, Application application) {
/* 9 */             if (!I10O1Ol00iIi.class.isAssignableFrom(cls)) {
/* 57 */                return l0Oll01O.I00000oIO(cls);
                    }
                    try {
/* 30 */                return (OooioIIoi0O) cls.getConstructor(Application.class).newInstance(application);
                    } catch (IllegalAccessException e) {
/* 49 */                OoOil11Ol1o.I000lI("Cannot create an instance of ", cls, e);
/* 11 */                return null;
                    } catch (InstantiationException e2) {
/* 45 */                OoOil11Ol1o.I000lI("Cannot create an instance of ", cls, e2);
/* 11 */                return null;
                    } catch (NoSuchMethodException e3) {
/* 53 */                OoOil11Ol1o.I000lI("Cannot create an instance of ", cls, e3);
/* 11 */                return null;
                    } catch (InvocationTargetException e4) {
/* 41 */                OoOil11Ol1o.I000lI("Cannot create an instance of ", cls, e4);
/* 11 */                return null;
                    }
                }

                @Override
                public final OooioIIoi0O I00000oIO(Class cls) {
/* 1 */             Application application = this.I00000oOI;
/* 3 */             if (application != null) {
/* 5 */                 return I0000O(cls, application);
                    }
/* 12 */            OoOil11Ol1o.I000OiO("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
/* 15 */            return null;
                }

                @Override
                public final OooioIIoi0O I00000oOI(Class cls, OI0l1OOllOo oI0l1OOllOo) {
/* 3 */             if (this.I00000oOI != null) {
/* 5 */                 return I00000oIO(cls);
                    }
/* 18 */            Application application = (Application) oI0l1OOllOo.I00000oIO.get(I0000O);
/* 20 */            if (application != null) {
/* 22 */                return I0000O(cls, application);
                    }
/* 33 */            if (!I10O1Ol00iIi.class.isAssignableFrom(cls)) {
/* 35 */                return l0Oll01O.I00000oIO(cls);
                    }
/* 42 */            I000II.I000iOII("CreationExtras must have an application by `APPLICATION_KEY`");
/* 45 */            return null;
                }
            }
