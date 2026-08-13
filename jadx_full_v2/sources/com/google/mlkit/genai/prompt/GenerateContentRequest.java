            package com.google.mlkit.genai.prompt;

            import com.google.mlkit.genai.prompt.Content;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.I000II;
            import p000.IOOi0Ool1i;
            import p000.IOOii0O10Io0;
            import p000.Oi010OO0;
            
            @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 72\u00020\u0001:\u000267R\u0014\u0010\u0002\u001a\u00020\u0003X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u0005X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u0005X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0014\u0010\b\u001a\u00020\u0005X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010\u0012\u001a\u00020\u0013X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001c\u0010'\u001a\u0004\u0018\u00010(8FX\u0087\u0004¢\u0006\f\u0012\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020.8FX\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010*\u001a\u0004\b0\u00101¨\u00068"}, d2 = {"Lcom/google/mlkit/genai/prompt/GenerateContentRequest;", "", "temperature", "", "seed", "", "topK", "candidateCount", "maxOutputTokens", "contents", "", "Lcom/google/mlkit/genai/prompt/Content;", "promptPrefix", "Lcom/google/mlkit/genai/prompt/PromptPrefix;", "cachedContextName", "", "systemInstruction", "Lcom/google/mlkit/genai/prompt/SystemInstruction;", "enableThinking", "", "<init>", "(FIIIILjava/util/List;Lcom/google/mlkit/genai/prompt/PromptPrefix;Ljava/lang/String;Lcom/google/mlkit/genai/prompt/SystemInstruction;Z)V", "getTemperature", "()F", "getSeed", "()I", "getTopK", "getCandidateCount", "getMaxOutputTokens", "getContents", "()Ljava/util/List;", "getPromptPrefix", "()Lcom/google/mlkit/genai/prompt/PromptPrefix;", "getCachedContextName", "()Ljava/lang/String;", "getSystemInstruction", "()Lcom/google/mlkit/genai/prompt/SystemInstruction;", "getEnableThinking", "()Z", "image", "Lcom/google/mlkit/genai/prompt/ImagePart;", "getImage$annotations", "()V", "getImage", "()Lcom/google/mlkit/genai/prompt/ImagePart;", "text", "Lcom/google/mlkit/genai/prompt/TextPart;", "getText$annotations", "getText", "()Lcom/google/mlkit/genai/prompt/TextPart;", "toBuilder", "Lcom/google/mlkit/genai/prompt/GenerateContentRequest$Builder;", "newImage", "newText", "Builder", "Companion", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 2 */     public final class GenerateContentRequest {

                public static final Companion INSTANCE = new Companion(null);
                private final float zza;
                private final int zzb;
                private final int zzc;
                private final int zzd;
                private final int zze;
                private final List zzf;
                private final PromptPrefix zzg;
                private final String zzh;
                private final SystemInstruction zzi;
                private final boolean zzj;

                public GenerateContentRequest(float f, int i, int i2, int i3, int i4, List list, PromptPrefix promptPrefix, String str, SystemInstruction systemInstruction, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
/* 4 */             this.zza = f;
/* 6 */             this.zzb = i;
/* 8 */             this.zzc = i2;
/* 10 */            this.zzd = i3;
/* 12 */            this.zze = i4;
/* 14 */            this.zzf = list;
/* 16 */            this.zzg = promptPrefix;
/* 18 */            this.zzh = str;
/* 20 */            this.zzi = systemInstruction;
/* 22 */            this.zzj = z;
                }

                public final String getZzh() {
/* 1 */             return this.zzh;
                }

                public final int getZzd() {
/* 1 */             return this.zzd;
                }

                public final List<Content> getContents() {
/* 1 */             return this.zzf;
                }

                public final boolean getZzj() {
/* 1 */             return this.zzj;
                }

                public final ImagePart getImage() {
/* 1 */             List list = this.zzf;
/* 7 */             ArrayList arrayList = new ArrayList();
/* 10 */            Iterator it = list.iterator();
/* 18 */            while (it.hasNext()) {
/* 32 */                IOOii0O10Io0.I00100l0(arrayList, ((Content) it.next()).getParts());
                    }
/* 38 */            ArrayList arrayList2 = new ArrayList();
/* 41 */            Iterator it2 = arrayList.iterator();
/* 49 */            while (it2.hasNext()) {
/* 51 */                Object next = it2.next();
/* 57 */                if (next instanceof ImagePart) {
/* 59 */                    arrayList2.add(next);
                        }
                    }
/* 67 */            return (ImagePart) IOOi0Ool1i.I00II0Ol1O0l(arrayList2);
                }

                public final int getZze() {
/* 1 */             return this.zze;
                }

                public final PromptPrefix getZzg() {
/* 1 */             return this.zzg;
                }

                public final int getZzb() {
/* 1 */             return this.zzb;
                }

                public final SystemInstruction getZzi() {
/* 1 */             return this.zzi;
                }

                public final float getZza() {
/* 1 */             return this.zza;
                }

                public final TextPart getText() {
/* 1 */             List list = this.zzf;
/* 7 */             ArrayList arrayList = new ArrayList();
/* 10 */            Iterator it = list.iterator();
/* 18 */            while (it.hasNext()) {
/* 32 */                IOOii0O10Io0.I00100l0(arrayList, ((Content) it.next()).getParts());
                    }
/* 38 */            ArrayList arrayList2 = new ArrayList();
/* 41 */            Iterator it2 = arrayList.iterator();
/* 49 */            while (it2.hasNext()) {
/* 51 */                Object next = it2.next();
/* 57 */                if (next instanceof TextPart) {
/* 59 */                    arrayList2.add(next);
                        }
                    }
/* 67 */            TextPart textPart = (TextPart) IOOi0Ool1i.I00II0Ol1O0l(arrayList2);
                    return textPart == null ? new TextPart("") : textPart;
                }

                public final int getZzc() {
/* 1 */             return this.zzc;
                }

                public final Builder zza(ImagePart imagePart, TextPart textPart) {
/* 5 */             Builder builder = new Builder((List<Content>) this.zzf);
/* 14 */            builder.setTemperature(Float.valueOf(this.zza));
/* 23 */            builder.setSeed(Integer.valueOf(this.zzb));
/* 32 */            builder.setTopK(Integer.valueOf(this.zzc));
/* 41 */            builder.setCandidateCount(Integer.valueOf(this.zzd));
/* 50 */            builder.setMaxOutputTokens(Integer.valueOf(this.zze));
/* 55 */            builder.setPromptPrefix(this.zzg);
/* 60 */            builder.setCachedContextName(this.zzh);
/* 65 */            builder.setSystemInstruction(this.zzi);
/* 70 */            builder.setEnableThinking(this.zzj);
/* 89 */            return builder;
                }

                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tJ\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\u000e"}, d2 = {"Lcom/google/mlkit/genai/prompt/GenerateContentRequest$Companion;", "", "<init>", "()V", "builder", "Lcom/google/mlkit/genai/prompt/GenerateContentRequest$Builder;", "image", "Lcom/google/mlkit/genai/prompt/ImagePart;", "text", "Lcom/google/mlkit/genai/prompt/TextPart;", "content", "Lcom/google/mlkit/genai/prompt/Content;", "systemInstruction", "Lcom/google/mlkit/genai/prompt/SystemInstruction;", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 3 */         public static final class Companion {
                    public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public final Builder builder(Content content) {
/* 3 */                 return new Builder(content);
                    }

/* 4 */             private Companion() {
/* 5 */                 throw null;
                    }

/* 6 */             public final Builder builder(ImagePart image, TextPart text) {
/* 7 */                 return new Builder(image, text);
                    }

/* 7 */             public final Builder builder(SystemInstruction systemInstruction, ImagePart image, TextPart text) {
/* 8 */                 return new Builder(systemInstruction, image, text);
                    }

/* 8 */             public final Builder builder(SystemInstruction systemInstruction, TextPart text) {
/* 9 */                 return new Builder(systemInstruction, text);
                    }

/* 9 */             public final Builder builder(TextPart text) {
/* 10 */                return new Builder(text);
                    }
                }

                @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\u0011B!\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\u0012J\u0006\u0010@\u001a\u00020AR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010%\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\u001e\u0010(\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b)\u0010!\"\u0004\b*\u0010#R\u001e\u0010+\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b,\u0010!\"\u0004\b-\u0010#R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u00104\u001a\u0004\u0018\u000105X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u00020;X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006B"}, d2 = {"Lcom/google/mlkit/genai/prompt/GenerateContentRequest$Builder;", "", "contents", "", "Lcom/google/mlkit/genai/prompt/Content;", "<init>", "(Ljava/util/List;)V", "content", "(Lcom/google/mlkit/genai/prompt/Content;)V", "text", "Lcom/google/mlkit/genai/prompt/TextPart;", "(Lcom/google/mlkit/genai/prompt/TextPart;)V", "image", "Lcom/google/mlkit/genai/prompt/ImagePart;", "(Lcom/google/mlkit/genai/prompt/ImagePart;Lcom/google/mlkit/genai/prompt/TextPart;)V", "systemInstruction", "Lcom/google/mlkit/genai/prompt/SystemInstruction;", "(Lcom/google/mlkit/genai/prompt/SystemInstruction;Lcom/google/mlkit/genai/prompt/TextPart;)V", "(Lcom/google/mlkit/genai/prompt/SystemInstruction;Lcom/google/mlkit/genai/prompt/ImagePart;Lcom/google/mlkit/genai/prompt/TextPart;)V", "getSystemInstruction", "()Lcom/google/mlkit/genai/prompt/SystemInstruction;", "setSystemInstruction", "(Lcom/google/mlkit/genai/prompt/SystemInstruction;)V", "temperature", "", "getTemperature", "()Ljava/lang/Float;", "setTemperature", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "seed", "", "getSeed", "()Ljava/lang/Integer;", "setSeed", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "topK", "getTopK", "setTopK", "candidateCount", "getCandidateCount", "setCandidateCount", "maxOutputTokens", "getMaxOutputTokens", "setMaxOutputTokens", "promptPrefix", "Lcom/google/mlkit/genai/prompt/PromptPrefix;", "getPromptPrefix", "()Lcom/google/mlkit/genai/prompt/PromptPrefix;", "setPromptPrefix", "(Lcom/google/mlkit/genai/prompt/PromptPrefix;)V", "cachedContextName", "", "getCachedContextName", "()Ljava/lang/String;", "setCachedContextName", "(Ljava/lang/String;)V", "enableThinking", "", "getEnableThinking", "()Z", "setEnableThinking", "(Z)V", "build", "Lcom/google/mlkit/genai/prompt/GenerateContentRequest;", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 27 */        public static final class Builder {
                    private final List zza;
                    private SystemInstruction zzb;
                    private Float zzc;
                    private Integer zzd;
                    private Integer zze;
                    private Integer zzf;
                    private Integer zzg;
                    private PromptPrefix zzh;
                    private String zzi;
                    private boolean zzj;

                    public Builder(SystemInstruction systemInstruction, ImagePart imagePart, TextPart textPart) {
/* 4 */                 this.zzb = systemInstruction;
/* 8 */                 Content.Builder builder = Content.INSTANCE.builder();
/* 12 */                builder.addPart(imagePart);
/* 15 */                builder.addPart(textPart);
/* 26 */                this.zza = Collections.singletonList(builder.build());
                    }

                    public final GenerateContentRequest build() {
                        int iIntValue;
                        int iIntValue2;
                        int iIntValue3;
/* 1 */                 List list = this.zza;
/* 4 */                 List list2 = list;
/* 7 */                 if (list2 == null || list2.isEmpty()) {
/* 294 */                   I000II.I000iOII("contents cannot be empty");
/* 6 */                     return null;
                        }
/* 15 */                Float f = this.zzc;
/* 17 */                float fFloatValue = 0.0f;
/* 18 */                if (f != null) {
/* 20 */                    float fFloatValue2 = f.floatValue();
/* 26 */                    if (fFloatValue2 < 0.0f || fFloatValue2 > 1.0f) {
/* 41 */                        I000II.I000iOII("temperature must be between 0 and 1");
/* 6 */                         return null;
                            }
/* 34 */                    fFloatValue = f.floatValue();
                        }
/* 45 */                Integer num = this.zzd;
/* 47 */                boolean z = false;
/* 48 */                if (num == null) {
/* 67 */                    iIntValue = 0;
                        } else {
/* 54 */                    if (num.intValue() < 0) {
/* 63 */                        I000II.I000iOII("seed must be non-negative");
/* 6 */                         return null;
                            }
/* 56 */                    iIntValue = num.intValue();
                        }
/* 68 */                Integer num2 = this.zze;
/* 70 */                if (num2 == null) {
/* 89 */                    iIntValue2 = 3;
                        } else {
/* 76 */                    if (num2.intValue() <= 0) {
/* 85 */                        I000II.I000iOII("topK must be positive");
/* 6 */                         return null;
                            }
/* 78 */                    iIntValue2 = num2.intValue();
                        }
/* 90 */                Integer num3 = this.zzf;
/* 93 */                if (num3 != null) {
/* 95 */                    int iIntValue4 = num3.intValue();
/* 99 */                    if (iIntValue4 <= 0 || iIntValue4 > 8) {
/* 112 */                       I000II.I000iOII("candidateCount must be between 1 and 8");
/* 6 */                         return null;
                            }
/* 105 */                   iIntValue3 = num3.intValue();
                        } else {
/* 116 */                   iIntValue3 = 1;
                        }
/* 117 */               Integer num4 = this.zzg;
/* 119 */               int iIntValue5 = Barcode.FORMAT_AZTEC;
/* 121 */               if (num4 != null) {
/* 123 */                   int iIntValue6 = num4.intValue();
/* 127 */                   if (iIntValue6 <= 0 || iIntValue6 > 4096) {
/* 157 */                       I000II.I000iOII(Oi010OO0.I00100l0(iIntValue6, "maxOutputTokens must be between 1 and 4096, but was ", new StringBuilder(String.valueOf(iIntValue6).length() + 52)));
/* 6 */                         return null;
                            }
/* 131 */                   iIntValue5 = num4.intValue();
                        }
/* 161 */               if (list != null) {
/* 164 */                   List list3 = list;
/* 168 */                   if (!(list3 instanceof Collection) || !list3.isEmpty()) {
/* 180 */                       Iterator it = list3.iterator();
                                loop0: while (true) {
/* 188 */                           if (!it.hasNext()) {
                                        break;
                                    }
/* 196 */                           List<Part> parts = ((Content) it.next()).getParts();
/* 204 */                           if (!(parts instanceof Collection) || !parts.isEmpty()) {
/* 216 */                               Iterator<T> it2 = parts.iterator();
/* 224 */                               while (it2.hasNext()) {
/* 234 */                                   if (((Part) it2.next()) instanceof ImagePart) {
/* 236 */                                       z = true;
                                                break loop0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
/* 237 */               PromptPrefix promptPrefix = this.zzh;
/* 239 */               if (promptPrefix != null && z) {
/* 246 */                   I000II.I000iOII("promptPrefix is not supported for image input");
/* 6 */                     return null;
                        }
/* 250 */               if (promptPrefix != null && this.zzi != null) {
/* 259 */                   I000II.I000iOII("promptPrefix and cacheContextName cannot be set at the same time");
/* 6 */                     return null;
                        }
/* 263 */               String str = this.zzi;
/* 265 */               if (str != null && z) {
/* 274 */                   I000II.I000iOII("cacheContextName is not supported for image input");
/* 6 */                     return null;
                        }
/* 288 */               return new GenerateContentRequest(fFloatValue, iIntValue, iIntValue2, iIntValue3, iIntValue5, list, promptPrefix, str, this.zzb, this.zzj, null);
                    }

                    public final String getZzi() {
/* 1 */                 return this.zzi;
                    }

                    public final Integer getZzf() {
/* 1 */                 return this.zzf;
                    }

                    public final boolean getZzj() {
/* 1 */                 return this.zzj;
                    }

                    public final Integer getZzg() {
/* 1 */                 return this.zzg;
                    }

                    public final PromptPrefix getZzh() {
/* 1 */                 return this.zzh;
                    }

                    public final Integer getZzd() {
/* 1 */                 return this.zzd;
                    }

                    public final SystemInstruction getZzb() {
/* 1 */                 return this.zzb;
                    }

                    public final Float getZzc() {
/* 1 */                 return this.zzc;
                    }

                    public final Integer getZze() {
/* 1 */                 return this.zze;
                    }

                    public final void setCachedContextName(String str) {
/* 1 */                 this.zzi = str;
                    }

                    public final void setCandidateCount(Integer num) {
/* 1 */                 this.zzf = num;
                    }

                    public final void setEnableThinking(boolean z) {
/* 1 */                 this.zzj = z;
                    }

                    public final void setMaxOutputTokens(Integer num) {
/* 1 */                 this.zzg = num;
                    }

                    public final void setPromptPrefix(PromptPrefix promptPrefix) {
/* 1 */                 this.zzh = promptPrefix;
                    }

                    public final void setSeed(Integer num) {
/* 1 */                 this.zzd = num;
                    }

                    public final void setSystemInstruction(SystemInstruction systemInstruction) {
/* 1 */                 this.zzb = systemInstruction;
                    }

                    public final void setTemperature(Float f) {
/* 1 */                 this.zzc = f;
                    }

                    public final void setTopK(Integer num) {
/* 1 */                 this.zze = num;
                    }

/* 28 */            public Builder(Content content) {
/* 31 */                this.zza = Collections.singletonList(content);
                    }

/* 31 */            public Builder(ImagePart imagePart, TextPart textPart) {
                        Content.Builder builder = Content.INSTANCE.builder();
                        builder.addPart(imagePart);
                        builder.addPart(textPart);
/* 34 */                this.zza = Collections.singletonList(builder.build());
                    }

/* 34 */            public Builder(List<Content> list) {
                        this.zza = list;
                    }

/* 35 */            public Builder(SystemInstruction systemInstruction, TextPart textPart) {
                        this.zzb = systemInstruction;
                        Content.Builder builder = Content.INSTANCE.builder();
                        builder.addPart(textPart);
/* 38 */                this.zza = Collections.singletonList(builder.build());
                    }

/* 38 */            public Builder(TextPart textPart) {
                        Content.Builder builder = Content.INSTANCE.builder();
                        builder.addPart(textPart);
/* 41 */                this.zza = Collections.singletonList(builder.build());
                    }
                }
            }
