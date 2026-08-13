            package p000;

            import android.app.Activity;
            import android.os.Bundle;
            
/* 35 */    public final class OOIli0OI0 extends Il00II01 {
                final OOIliOOi010 this$0;

                public static final class I00000oIO extends Il00II01 {
                    final OOIliOOi010 this$0;

                    public I00000oIO(OOIliOOi010 oOIliOOi010) {
/* 1 */                 this.this$0 = oOIliOOi010;
                    }

                    @Override
                    public void onActivityPostResumed(Activity activity) {
/* 1 */                 OOIliOOi010 oOIliOOi010 = this.this$0;
/* 6 */                 int i = oOIliOOi010.I00iiI + 1;
/* 7 */                 oOIliOOi010.I00iiI = i;
/* 9 */                 if (i == 1) {
/* 13 */                    if (!oOIliOOi010.I00iiO) {
/* 30 */                        oOIliOOi010.I00ilI0I1.removeCallbacks(oOIliOOi010.I00io1l);
                            } else {
/* 19 */                        oOIliOOi010.I00ilO0.I010iIIOlo(O0oOOiI0.ON_RESUME);
/* 23 */                        oOIliOOi010.I00iiO = false;
                            }
                        }
                    }

                    @Override
                    public void onActivityPostStarted(Activity activity) {
/* 1 */                 OOIliOOi010 oOIliOOi010 = this.this$0;
/* 6 */                 int i = oOIliOOi010.I00iOIl + 1;
/* 7 */                 oOIliOOi010.I00iOIl = i;
/* 9 */                 if (i == 1 && oOIliOOi010.I00iio) {
/* 19 */                    oOIliOOi010.I00ilO0.I010iIIOlo(O0oOOiI0.ON_START);
/* 23 */                    oOIliOOi010.I00iio = false;
                        }
                    }
                }

                public OOIli0OI0(OOIliOOi010 oOIliOOi010) {
/* 1 */             this.this$0 = oOIliOOi010;
                }

                @Override
                public void onActivityPaused(Activity activity) {
/* 1 */             OOIliOOi010 oOIliOOi010 = this.this$0;
                    int i = oOIliOOi010.I00iiI - 1;
/* 7 */             oOIliOOi010.I00iiI = i;
/* 9 */             if (i == 0) {
/* 17 */                oOIliOOi010.I00ilI0I1.postDelayed(oOIliOOi010.I00io1l, 700L);
                    }
                }

                @Override
                public void onActivityPreCreated(Activity activity, Bundle bundle) {
/* 8 */             activity.registerActivityLifecycleCallbacks(new I00000oIO(this.this$0));
                }

                @Override
                public void onActivityStopped(Activity activity) {
/* 1 */             OOIliOOi010 oOIliOOi010 = this.this$0;
                    int i = oOIliOOi010.I00iOIl - 1;
/* 7 */             oOIliOOi010.I00iOIl = i;
/* 9 */             if (i == 0 && oOIliOOi010.I00iiO) {
/* 19 */                oOIliOOi010.I00ilO0.I010iIIOlo(O0oOOiI0.ON_STOP);
/* 23 */                oOIliOOi010.I00iio = true;
                    }
                }

                @Override
/* 36 */        public void onActivityCreated(Activity activity, Bundle bundle) {
                }
            }
