            package p000;

            import android.app.Application;
            import com.box.gallery.MainActivity;
            import java.lang.invoke.VarHandle;
            
            public final class I0II1i1l0 implements IloolIii1o {
                public volatile Ii10ooiIO I00iOIl;
                public Object I00iiI;
                public MainActivity I00iiO;
                public I0IiI0ii1i1l I00iio;
                public IIOo1i I00ilI0I1;

                public final Ii10ooiIO I00000oIO() {
                    String str;
/* 1 */             MainActivity mainActivity = this.I00iiO;
/* 9 */             if (!(mainActivity.getApplication() instanceof IloolIii1o)) {
/* 27 */                if (Application.class.equals(mainActivity.getApplication().getClass())) {
/* 29 */                    str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
                        } else {
/* 50 */                    str = "Found: " + mainActivity.getApplication().getClass();
                        }
/* 63 */                throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. ".concat(str));
                    }
/* 74 */            Ii110iO01ol1 ii110iO01ol1 = (Ii110iO01ol1) ((I0II1Il) ilII1oOi1.I00000oIO(I0II1Il.class, this.I00iio));
/* 76 */            Ii110ilOil ii110ilOil = ii110iO01ol1.I00000oIO;
/* 78 */            Ii110iO01ol1 ii110iO01ol12 = ii110iO01ol1.I00000oOI;
/* 82 */            Ii10ooiIO ii10ooiIO = new Ii10ooiIO();
/* 85 */            ii10ooiIO.I00000oIO = ii110ilOil;
/* 87 */            ii10ooiIO.I00000oOI = ii110iO01ol12;
/* 89 */            VarHandle.storeStoreFence();
/* 110 */           return ii10ooiIO;
                }

                @Override
                public final Object I0000Il00O() {
/* 3 */             if (this.I00iOIl == null) {
                        synchronized (this.I00iiI) {
                            try {
/* 10 */                        if (this.I00iOIl == null) {
/* 16 */                            this.I00iOIl = I00000oIO();
                                }
                            } finally {
                            }
                        }
                    }
/* 25 */            return this.I00iOIl;
                }
            }
