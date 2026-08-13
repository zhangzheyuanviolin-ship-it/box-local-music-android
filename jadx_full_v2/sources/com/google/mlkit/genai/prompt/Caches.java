            package com.google.mlkit.genai.prompt;

            import kotlin.Metadata;
            import p000.IOoil1iiIilo;
            
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH¦@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u000f\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/google/mlkit/genai/prompt/Caches;", "", "Lcom/google/mlkit/genai/prompt/CreateCachedContextRequest;", "request", "Lcom/google/mlkit/genai/prompt/CachedContext;", "create", "(Lcom/google/mlkit/genai/prompt/CreateCachedContextRequest;LIOoil1iiIilo;)Ljava/lang/Object;", "", "name", "get", "(Ljava/lang/String;LIOoil1iiIilo;)Ljava/lang/Object;", "", "list", "(LIOoil1iiIilo;)Ljava/lang/Object;", "", "delete", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public interface Caches {
                Object create(CreateCachedContextRequest createCachedContextRequest, IOoil1iiIilo iOoil1iiIilo);

                Object delete(String str, IOoil1iiIilo iOoil1iiIilo);

                Object get(String str, IOoil1iiIilo iOoil1iiIilo);

                Object list(IOoil1iiIilo iOoil1iiIilo);
            }
