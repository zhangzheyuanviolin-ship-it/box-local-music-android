            package com.k2fsa.sherpa.onnx;

            import com.google.ai.edge.gallery.BuildConfig;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0019\u0018\u0000 12\u00020\u0001:\u00011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082 ¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u0015\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014H\u0082 ¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0082 ¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u001b\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0082 ¢\u0006\u0004\b\u001b\u0010\u001cJ0\u0010\u001d\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0082 ¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\u001f\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0082 ¢\u0006\u0004\b\u001f\u0010\u0018J\u0018\u0010 \u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b \u0010!J\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\u00142\u0006\u0010\t\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\nH\u0004¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\n¢\u0006\u0004\b&\u0010%J\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010'J#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014¢\u0006\u0004\b\u0012\u0010(J\u0015\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010)J\u001d\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010*J%\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010+J\u0015\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010)J\r\u0010 \u001a\u00020\u0002¢\u0006\u0004\b \u0010,J\u0013\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\u0014¢\u0006\u0004\b\"\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010,R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00100¨\u00062"}, d2 = {"Lcom/k2fsa/sherpa/onnx/SpeakerEmbeddingManager;", "", "", "dim", "<init>", "(I)V", "", "create", "(I)J", "ptr", "LOoiIlOl1iI;", "delete", "(J)V", "", "name", "", "embedding", "", "add", "(JLjava/lang/String;[F)Z", "", "addList", "(JLjava/lang/String;[[F)Z", "remove", "(JLjava/lang/String;)Z", "", "threshold", "search", "(J[FF)Ljava/lang/String;", "verify", "(JLjava/lang/String;[FF)Z", "contains", "numSpeakers", "(J)I", "allSpeakerNames", "(J)[Ljava/lang/String;", "finalize", "()V", BuildConfig.BUILD_TYPE, "(Ljava/lang/String;[F)Z", "(Ljava/lang/String;[[F)Z", "(Ljava/lang/String;)Z", "([FF)Ljava/lang/String;", "(Ljava/lang/String;[FF)Z", "()I", "()[Ljava/lang/String;", "I", "getDim", "J", "Companion", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 6 */     public final class SpeakerEmbeddingManager {
                private final int dim;
                private long ptr;

                static {
/* 11 */            System.loadLibrary("sherpa-onnx-jni");
                }

                public SpeakerEmbeddingManager(int i) {
/* 4 */             this.dim = i;
/* 10 */            this.ptr = create(i);
                }

                private final native boolean add(long ptr, String name, float[] embedding);

                private final native boolean addList(long ptr, String name, float[][] embedding);

                private final native String[] allSpeakerNames(long ptr);

                private final native boolean contains(long ptr, String name);

                private final native long create(int dim);

                private final native void delete(long ptr);

                private final native int numSpeakers(long ptr);

                private final native boolean remove(long ptr, String name);

                private final native String search(long ptr, float[] embedding, float threshold);

                private final native boolean verify(long ptr, String name, float[] embedding, float threshold);

                public final boolean add(String name, float[] embedding) {
/* 3 */             return add(this.ptr, name, embedding);
                }

                public final String[] allSpeakerNames() {
/* 3 */             return allSpeakerNames(this.ptr);
                }

                public final boolean contains(String name) {
/* 3 */             return contains(this.ptr, name);
                }

                public final void finalize() {
/* 1 */             long j = this.ptr;
/* 7 */             if (j != 0) {
/* 9 */                 delete(j);
/* 12 */                this.ptr = 0L;
                    }
                }

                public final int getDim() {
/* 1 */             return this.dim;
                }

                public final int numSpeakers() {
/* 3 */             return numSpeakers(this.ptr);
                }

                public final void release() {
/* 1 */             finalize();
                }

                public final boolean remove(String name) {
/* 3 */             return remove(this.ptr, name);
                }

                public final String search(float[] embedding, float threshold) {
/* 3 */             return search(this.ptr, embedding, threshold);
                }

                public final boolean verify(String name, float[] embedding, float threshold) {
/* 7 */             return verify(this.ptr, name, embedding, threshold);
                }

/* 7 */         public final boolean add(String name, float[][] embedding) {
/* 8 */             return addList(this.ptr, name, embedding);
                }
            }
