            package org.tensorflow.lite;

            import java.nio.ByteBuffer;
            import java.util.Map;
            import p000.I000II;
            import p000.IIi0oIl;
            
            public final class I00000oIO implements AutoCloseable {
                public NativeInterpreterWrapperExperimental I00iOIl;

                public I00000oIO(ByteBuffer byteBuffer, IIi0oIl iIi0oIl) {
/* 3 */             NativeInterpreterWrapperExperimental nativeInterpreterWrapperExperimental = new NativeInterpreterWrapperExperimental(byteBuffer, iIi0oIl);
/* 9 */             this.I00iOIl = nativeInterpreterWrapperExperimental;
/* 11 */            nativeInterpreterWrapperExperimental.I0000Il00O();
                }

                public final void I00000oIO(Object[] objArr, Map map) {
/* 1 */             NativeInterpreterWrapperExperimental nativeInterpreterWrapperExperimental = this.I00iOIl;
/* 3 */             if (nativeInterpreterWrapperExperimental != null) {
/* 5 */                 nativeInterpreterWrapperExperimental.I000II(objArr, map);
                    } else {
/* 11 */                I000II.I001IO000("Internal error: The Interpreter has already been closed.");
                    }
                }

                @Override
                public final void close() {
/* 1 */             NativeInterpreterWrapperExperimental nativeInterpreterWrapperExperimental = this.I00iOIl;
/* 3 */             if (nativeInterpreterWrapperExperimental != null) {
/* 5 */                 nativeInterpreterWrapperExperimental.close();
/* 9 */                 this.I00iOIl = null;
                    }
                }

                public final void finalize() throws Throwable {
                    try {
/* 1 */                 close();
                    } finally {
/* 9 */                 super.finalize();
                    }
                }
            }
