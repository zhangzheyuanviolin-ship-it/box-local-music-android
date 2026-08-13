            package com.google.ai.edge.litertlm;

            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.Il01100l;
            import p000.Il011I1OiO0I;
            import p000.O01I0il01001;
            import p000.O01O10Ii;
            import p000.O01l0lO0li;
            import p000.O01li1IO;
            import p000.O1Oii0O0loo;
            
            @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/google/ai/edge/litertlm/ToolManager;", "", "", "Lcom/google/ai/edge/litertlm/ToolProvider;", "tools", "<init>", "(Ljava/util/List;)V", "", "functionName", "LO01l0lO0li;", "params", "LO01O10Ii;", "execute", "(Ljava/lang/String;LO01l0lO0li;)LO01O10Ii;", "LO01I0il01001;", "getToolsDescription", "()LO01I0il01001;", "Ljava/util/List;", "getTools", "()Ljava/util/List;", "", "Lcom/google/ai/edge/litertlm/InternalJsonTool;", "internalTools", "Ljava/util/Map;", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 36 */    public final class ToolManager {
                private final Map<String, InternalJsonTool> internalTools;
                private final List<ToolProvider> tools;

                /* JADX WARN: Multi-variable type inference failed */
                public ToolManager(List<? extends ToolProvider> list) {
/* 4 */             this.tools = list;
/* 8 */             Iterator it = list.iterator();
/* 12 */            Map<String, InternalJsonTool> mapI0001Ioi1lo = Il011I1OiO0I.I00iOIl;
/* 18 */            while (it.hasNext()) {
/* 30 */                mapI0001Ioi1lo = O1Oii0O0loo.I0001Ioi1lo(mapI0001Ioi1lo, ((ToolProvider) it.next()).mo16xff1c5ada());
                    }
/* 35 */            this.internalTools = mapI0001Ioi1lo;
                }

                public final O01O10Ii execute(String functionName, O01l0lO0li params) {
                    try {
/* 5 */                 InternalJsonTool internalJsonTool = this.internalTools.get(functionName);
/* 11 */                if (internalJsonTool != null) {
/* 17 */                    return JsonConvertersKt.toJsonElement(internalJsonTool.execute(params));
                        }
/* 31 */                throw new IllegalArgumentException("Tool not found: ".concat(functionName));
                    } catch (Exception e) {
/* 49 */                O01li1IO o01li1IO = new O01li1IO();
/* 52 */                o01li1IO.I00iOIl = "Error occured. " + e;
/* 106 */               return o01li1IO;
                    }
                }

                public final List<ToolProvider> getTools() {
/* 1 */             return this.tools;
                }

                public final O01I0il01001 getToolsDescription() {
/* 3 */             O01I0il01001 o01I0il01001 = new O01I0il01001();
/* 20 */            for (InternalJsonTool internalJsonTool : this.internalTools.values()) {
/* 30 */                O01l0lO0li o01l0lO0li = new O01l0lO0li();
/* 37 */                o01l0lO0li.I0001Ioi1lo("type", "function");
/* 44 */                o01l0lO0li.I0000oI00("function", internalJsonTool.getToolDescription());
/* 47 */                o01I0il01001.I0000oI00(o01l0lO0li);
                    }
/* 55 */            return o01I0il01001;
                }

                /* JADX WARN: Multi-variable type inference failed */
/* 37 */        public ToolManager() {
/* 38 */            this(null, 1, 0 == true ? 1 : 0);
                }

/* 38 */        public ToolManager(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 39 */            this((i & 1) != 0 ? Il01100l.I00iOIl : list);
                }
            }
