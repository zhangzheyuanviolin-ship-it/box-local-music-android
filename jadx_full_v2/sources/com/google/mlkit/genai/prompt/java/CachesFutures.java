            package com.google.mlkit.genai.prompt.java;

            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.genai.prompt.CreateCachedContextRequest;
            import com.google.mlkit.genai.prompt.GenerativeModel;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            
            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n0\u0005H&J\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\f\u001a\u00020\rH&J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u0011"}, d2 = {"Lcom/google/mlkit/genai/prompt/java/CachesFutures;", "", "<init>", "()V", "create", "Lcom/google/common/util/concurrent/ListenableFuture;", "Lcom/google/mlkit/genai/prompt/CachedContext;", "request", "Lcom/google/mlkit/genai/prompt/CreateCachedContextRequest;", "list", "", "get", "name", "", "delete", "", "Companion", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 2 */     public abstract class CachesFutures {

                public static final Companion INSTANCE = new Companion(null);

                public static final CachesFutures from(GenerativeModel generativeModel) {
/* 3 */             return INSTANCE.from(generativeModel);
                }

                public abstract ListenableFuture create(CreateCachedContextRequest request);

                public abstract ListenableFuture delete(String name);

                public abstract ListenableFuture get(String name);

                public abstract ListenableFuture list();

                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/google/mlkit/genai/prompt/java/CachesFutures$Companion;", "", "<init>", "()V", "from", "Lcom/google/mlkit/genai/prompt/java/CachesFutures;", "generativeModel", "Lcom/google/mlkit/genai/prompt/GenerativeModel;", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 3 */         public static final class Companion {
                    public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public final CachesFutures from(GenerativeModel generativeModel) {
/* 3 */                 return new zzm(generativeModel);
                    }

/* 4 */             private Companion() {
/* 5 */                 throw null;
                    }
                }
            }
