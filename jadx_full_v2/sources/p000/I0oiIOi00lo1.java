            package p000;

            import android.hardware.camera2.params.OutputConfiguration;
            
            public final class I0oiIOi00lo1 implements OoilIiI0oi {
                public final OutputConfiguration I00iOIl;

                public I0oiIOi00lo1(OutputConfiguration outputConfiguration) {
/* 4 */             this.I00iOIl = outputConfiguration;
/* 6 */             outputConfiguration.getSurface();
                }

                @Override
                public final Object I00l0I0l0lO1(O0IOli0o0 o0IOli0o0) {
/* 13 */            if (o0IOli0o0.equals(OOoOl0i.I00000oIO.I00000oOI(OutputConfiguration.class))) {
/* 15 */                return this.I00iOIl;
                    }
/* 18 */            return null;
                }

                public final String toString() {
/* 3 */             return this.I00iOIl.toString();
                }
            }
