            package p000;

            import android.os.Handler;
            import java.util.concurrent.Executor;
            
            public final class IIoO11o implements OloIIlI1o10 {
                public static final I1ioiI I00iiI = I1ioiI.I00000oIO("camerax.core.appConfig.cameraFactoryProvider", IIli01O.class, null);
                public static final I1ioiI I00iiO = I1ioiI.I00000oIO("camerax.core.appConfig.deviceSurfaceManagerProvider", IIl00i0o0oI.class, null);
                public static final I1ioiI I00iio = I1ioiI.I00000oIO("camerax.core.appConfig.useCaseConfigFactoryProvider", IIl00l.class, null);
                public static final I1ioiI I00ilI0I1 = I1ioiI.I00000oIO("camerax.core.appConfig.cameraExecutor", Executor.class, null);
                public static final I1ioiI I00ilO0 = I1ioiI.I00000oIO("camerax.core.appConfig.schedulerHandler", Handler.class, null);
                public static final I1ioiI I00io1l = I1ioiI.I00000oIO("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE, null);
                public static final I1ioiI I00ioIO = I1ioiI.I00000oIO("camerax.core.appConfig.availableCamerasLimiter", IIo0l1.class, null);
                public static final I1ioiI I00l0I0l0lO1 = I1ioiI.I00000oIO("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE, null);
                public static final I1ioiI I00l0OO0IO = I1ioiI.I00000oIO("camerax.core.appConfig.cameraProviderInitRetryPolicy", Oi110Iil1i0.class, null);
                public static final I1ioiI I00li1OI = I1ioiI.I00000oIO("camerax.core.appConfig.quirksSettings", OOil00Iill.class, null);
                public static final I1ioiI I00ll1 = I1ioiI.I00000oIO("camerax.core.appConfig.repeatingStreamForced", Boolean.TYPE, null);
                public OIil0iio0 I00iOIl;

                public final IIo0l1 I0001Ioi1lo() {
/* 10 */            return (IIo0l1) this.I00iOIl.I00000oOI(I00ioIO, null);
                }

                public final IIli01O I000OOo1O() {
/* 10 */            return (IIli01O) this.I00iOIl.I00000oOI(I00iiI, null);
                }

                public final long I000iOII() {
/* 17 */            return ((Long) this.I00iOIl.I00000oOI(I00l0I0l0lO1, -1L)).longValue();
                }

                @Override
                public final IOlOo1ll1l1 I000l1() {
/* 1 */             return this.I00iOIl;
                }

                public final IIl00i0o0oI I000lI() {
/* 10 */            return (IIl00i0o0oI) this.I00iOIl.I00000oOI(I00iiO, null);
                }

                public final IIl00l I0010I0i() {
/* 10 */            return (IIl00l) this.I00iOIl.I00000oOI(I00iio, null);
                }
            }
