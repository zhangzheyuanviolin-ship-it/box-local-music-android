            package com.google.ai.edge.litert;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0010\u0018\u0000 #2\u00020\u0001:\u0001#B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\bH\u0014¢\u0006\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/google/ai/edge/litert/TensorBuffer;", "Lcom/google/ai/edge/litert/JniHandle;", "", "handle", "<init>", "(J)V", "", "data", "LOoiIlOl1iI;", "writeInt", "([I)V", "", "writeFloat", "([F)V", "", "writeInt8", "([B)V", "", "writeBoolean", "([Z)V", "", "writeLong", "([J)V", "readInt", "()[I", "readFloat", "()[F", "readInt8", "()[B", "readBoolean", "()[Z", "readLong", "()[J", "destroy", "()V", "Companion", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 2 */     public final class TensorBuffer extends JniHandle {

                public static final Companion INSTANCE = new Companion(null);

                static {
/* 11 */            System.loadLibrary("LiteRt");
                }

                public TensorBuffer(long j) {
/* 1 */             super(j);
                }

                private static final native void nativeDestroy(long j);

                private static final native boolean[] nativeReadBoolean(long j);

                private static final native float[] nativeReadFloat(long j);

                private static final native int[] nativeReadInt(long j);

                private static final native byte[] nativeReadInt8(long j);

                private static final native long[] nativeReadLong(long j);

                private static final native void nativeWriteBoolean(long j, boolean[] zArr);

                private static final native void nativeWriteFloat(long j, float[] fArr);

                private static final native void nativeWriteInt(long j, int[] iArr);

                private static final native void nativeWriteInt8(long j, byte[] bArr);

                private static final native void nativeWriteLong(long j, long[] jArr);

                @Override
                public void destroy() {
/* 1 */             INSTANCE.nativeDestroy(getHandle());
                }

                public final boolean[] readBoolean() {
/* 1 */             assertNotDestroyed();
/* 1 */             return INSTANCE.nativeReadBoolean(getHandle());
                }

                public final float[] readFloat() {
/* 1 */             assertNotDestroyed();
/* 1 */             return INSTANCE.nativeReadFloat(getHandle());
                }

                public final int[] readInt() {
/* 1 */             assertNotDestroyed();
/* 1 */             return INSTANCE.nativeReadInt(getHandle());
                }

                public final byte[] readInt8() {
/* 1 */             assertNotDestroyed();
/* 1 */             return INSTANCE.nativeReadInt8(getHandle());
                }

                public final long[] readLong() {
/* 1 */             assertNotDestroyed();
/* 1 */             return INSTANCE.nativeReadLong(getHandle());
                }

                public final void writeBoolean(boolean[] data) {
/* 1 */             assertNotDestroyed();
/* 1 */             INSTANCE.nativeWriteBoolean(getHandle(), data);
                }

                public final void writeFloat(float[] data) {
/* 1 */             assertNotDestroyed();
/* 1 */             INSTANCE.nativeWriteFloat(getHandle(), data);
                }

                public final void writeInt(int[] data) {
/* 1 */             assertNotDestroyed();
/* 1 */             INSTANCE.nativeWriteInt(getHandle(), data);
                }

                public final void writeInt8(byte[] data) {
/* 1 */             assertNotDestroyed();
/* 1 */             INSTANCE.nativeWriteInt8(getHandle(), data);
                }

                public final void writeLong(long[] data) {
/* 1 */             assertNotDestroyed();
/* 1 */             INSTANCE.nativeWriteLong(getHandle(), data);
                }

                @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0083 ¢\u0006\u0004\b\f\u0010\rJ \u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000eH\u0083 ¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0011H\u0083 ¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0014H\u0083 ¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/google/ai/edge/litert/TensorBuffer$Companion;", "", "<init>", "()V", "", "handle", "", "data", "LOoiIlOl1iI;", "nativeWriteInt", "(J[I)V", "", "nativeWriteFloat", "(J[F)V", "", "nativeWriteInt8", "(J[B)V", "", "nativeWriteBoolean", "(J[Z)V", "", "nativeWriteLong", "(J[J)V", "nativeReadInt", "(J)[I", "nativeReadFloat", "(J)[F", "nativeReadInt8", "(J)[B", "nativeReadBoolean", "(J)[Z", "nativeReadLong", "(J)[J", "nativeDestroy", "(J)V", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 3 */         public static final class Companion {
                    public Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    private final void nativeDestroy(long handle) {
/* 1 */                 TensorBuffer.nativeDestroy(handle);
                    }

                    private final boolean[] nativeReadBoolean(long handle) {
/* 1 */                 return TensorBuffer.nativeReadBoolean(handle);
                    }

                    private final float[] nativeReadFloat(long handle) {
/* 1 */                 return TensorBuffer.nativeReadFloat(handle);
                    }

                    private final int[] nativeReadInt(long handle) {
/* 1 */                 return TensorBuffer.nativeReadInt(handle);
                    }

                    private final byte[] nativeReadInt8(long handle) {
/* 1 */                 return TensorBuffer.nativeReadInt8(handle);
                    }

                    private final long[] nativeReadLong(long handle) {
/* 1 */                 return TensorBuffer.nativeReadLong(handle);
                    }

                    private final void nativeWriteBoolean(long handle, boolean[] data) {
/* 1 */                 TensorBuffer.nativeWriteBoolean(handle, data);
                    }

                    private final void nativeWriteFloat(long handle, float[] data) {
/* 1 */                 TensorBuffer.nativeWriteFloat(handle, data);
                    }

                    private final void nativeWriteInt(long handle, int[] data) {
/* 1 */                 TensorBuffer.nativeWriteInt(handle, data);
                    }

                    private final void nativeWriteInt8(long handle, byte[] data) {
/* 1 */                 TensorBuffer.nativeWriteInt8(handle, data);
                    }

                    private final void nativeWriteLong(long handle, long[] data) {
/* 1 */                 TensorBuffer.nativeWriteLong(handle, data);
                    }

/* 4 */             private Companion() {
                    }
                }
            }
