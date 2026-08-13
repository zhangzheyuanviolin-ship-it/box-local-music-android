            package com.google.ai.edge.gallery.customtasks.tinygarden;

            import com.google.ai.edge.litertlm.Tool;
            import com.google.ai.edge.litertlm.ToolParam;
            import com.google.ai.edge.litertlm.ToolSet;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            import p000.O1Oii0O0loo;
            import p000.OIoi0IIoi;
            import p000.Oo1I0I0oo1O;
            import p000.Oo1I0Ol;
            
            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\b\b\u0001\u0010\u0010\u001a\u00020\f2\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u0013\u0010\u000fR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/google/ai/edge/gallery/customtasks/tinygarden/TinyGardenTools;", "Lcom/google/ai/edge/litertlm/ToolSet;", "Lkotlin/Function1;", "LOo1I0I0oo1O;", "LOoiIlOl1iI;", "onFunctionCalled", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "", "plots", "", "", "", "waterPlots", "(Ljava/util/List;)Ljava/util/Map;", "seed", "plantSeed", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/Map;", "harvestPlots", "Lkotlin/jvm/functions/Function1;", "getOnFunctionCalled", "()Lkotlin/jvm/functions/Function1;", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class TinyGardenTools implements ToolSet {
                public static final int $stable = 0;
                private final Function1 onFunctionCalled;

                public TinyGardenTools(Function1 function1) {
/* 4 */             this.onFunctionCalled = function1;
                }

                public final Function1 getOnFunctionCalled() {
/* 1 */             return this.onFunctionCalled;
                }

                @Tool(description = "Harvest one or more garden plots.")
                public final Map<String, Object> harvestPlots(@ToolParam(description = "The IDs of the plots to harvest.") List<Integer> plots) {
/* 1 */             plots.toString();
/* 4 */             Function1 function1 = this.onFunctionCalled;
/* 8 */             Oo1I0Ol[] oo1I0OlArr = Oo1I0Ol.I00iOIl;
/* 14 */            function1.invoke(new Oo1I0I0oo1O(6, plots));
/* 37 */            return O1Oii0O0loo.I0000O(new OIoi0IIoi("result", "success"), new OIoi0IIoi("plots", plots));
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
                java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
                 */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
                @Tool(description = "Plant a seed in one or more garden plots.")
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Map<String, Object> plantSeed(@ToolParam(description = "The name of the seed to plant.") String seed, @ToolParam(description = "The IDs of the plots to plant a seed in.") List<Integer> plots) {
                    int i;
/* 1 */             plots.toString();
/* 6 */             String lowerCase = seed.toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2083958873:
/* 82 */                    if (!lowerCase.equals("sunflower")) {
/* 88 */                        i = -1;
                                break;
                            } else {
/* 84 */                        Oo1I0Ol[] oo1I0OlArr = Oo1I0Ol.I00iOIl;
/* 86 */                        i = 0;
                                break;
                            }
                        case -2008465223:
/* 69 */                    if (lowerCase.equals("special")) {
/* 72 */                        Oo1I0Ol[] oo1I0OlArr2 = Oo1I0Ol.I00iOIl;
/* 74 */                        i = 3;
                                break;
                            }
                            break;
                        case -906277200:
/* 60 */                    if (!lowerCase.equals("secret")) {
                            }
                            break;
                        case -345345041:
/* 51 */                    if (!lowerCase.equals("edge gallery")) {
                            }
                            break;
                        case 3506511:
/* 38 */                    if (lowerCase.equals("rose")) {
/* 41 */                        Oo1I0Ol[] oo1I0OlArr3 = Oo1I0Ol.I00iOIl;
/* 43 */                        i = 2;
                                break;
                            }
                            break;
                        case 95346418:
/* 25 */                    if (lowerCase.equals("daisy")) {
/* 28 */                        Oo1I0Ol[] oo1I0OlArr4 = Oo1I0Ol.I00iOIl;
/* 30 */                        i = 1;
                                break;
                            }
                            break;
                    }
/* 89 */            int i2 = i + 1;
/* 90 */            if (i2 > 0) {
/* 99 */                this.onFunctionCalled.invoke(new Oo1I0I0oo1O(i2, plots));
                    }
/* 129 */           return O1Oii0O0loo.I0000O(new OIoi0IIoi("result", "success"), new OIoi0IIoi("seed", seed), new OIoi0IIoi("plots", plots));
                }

                @Tool(description = "Water one or more garden plots.")
                public final Map<String, Object> waterPlots(@ToolParam(description = "The IDs of the plots to water.") List<Integer> plots) {
/* 1 */             plots.toString();
/* 4 */             Function1 function1 = this.onFunctionCalled;
/* 8 */             Oo1I0Ol[] oo1I0OlArr = Oo1I0Ol.I00iOIl;
/* 14 */            function1.invoke(new Oo1I0I0oo1O(5, plots));
/* 37 */            return O1Oii0O0loo.I0000O(new OIoi0IIoi("result", "success"), new OIoi0IIoi("plots", plots));
                }
            }
