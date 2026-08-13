            package p000;

            import com.box.gallery.MainActivity;
            import java.lang.invoke.VarHandle;
            
            public final class I0IiI0ii1i1l implements IloolIii1o {
                public MainActivity I00iOIl;
                public MainActivity I00iiI;
                public volatile Ii110iO01ol1 I00iiO;
                public Object I00iio;

                @Override
                public final Object I0000Il00O() {
/* 3 */             if (this.I00iiO == null) {
                        synchronized (this.I00iio) {
                            try {
/* 10 */                        if (this.I00iiO == null) {
/* 12 */                            MainActivity mainActivity = this.I00iOIl;
/* 14 */                            MainActivity mainActivity2 = this.I00iiI;
/* 21 */                            I0IOoio1iool i0IOoio1iool = new I0IOoio1iool(0);
/* 24 */                            i0IOoio1iool.I00000oOI = mainActivity2;
/* 26 */                            VarHandle.storeStoreFence();
/* 50 */                            this.I00iiO = ((I0Ii0oI1) new Oool0iOoooIo(mainActivity.I000II(), i0IOoio1iool, li1iolIo.I00000oIO(mainActivity)).I00000oOI(I0Ii0oI1.class)).I00000oOI;
                                }
                            } finally {
                            }
                        }
                    }
/* 59 */            return this.I00iiO;
                }
            }
