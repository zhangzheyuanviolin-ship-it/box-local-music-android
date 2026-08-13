            package com.google.ai.edge.gallery.customtasks.agentchat;

            import android.content.Context;
            import android.os.Bundle;
            import com.google.ai.edge.litertlm.Tool;
            import com.google.ai.edge.litertlm.ToolParam;
            import com.google.ai.edge.litertlm.ToolSet;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.Map;
            import kotlin.Metadata;
            import p000.I0i1Io;
            import p000.I0iOlI010ii;
            import p000.IIIII1OI1;
            import p000.IO1010;
            import p000.Ii1oo1ooill0;
            import p000.IiI0oillOO10;
            import p000.IiiIil1lOIO;
            import p000.Ilo0li0l1;
            import p000.O0000Ioio00;
            import p000.O1i1O1I;
            import p000.O1iIlllIoo;
            import p000.OOlloO;
            import p000.iOIii1ooOi0I;
            import p000.iOi1IOoIO0l;
            import p000.iOl1iOi0I;
            
            @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\r2\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\"\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lcom/google/ai/edge/gallery/customtasks/agentchat/McpToolSet;", "Lcom/google/ai/edge/litertlm/ToolSet;", "<init>", "()V", "", "success", "", "errorType", "LOoiIlOl1iI;", "logMcpExecution", "(ZLjava/lang/String;)V", "toolName", "input", "", "runMcpTool", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;", "LI0i1Io;", "action", "sendAgentAction", "(LI0i1Io;)V", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "LO1i1O1I;", "mcpManagerViewModel", "LO1i1O1I;", "getMcpManagerViewModel", "()LO1i1O1I;", "setMcpManagerViewModel", "(LO1i1O1I;)V", "taskId", "Ljava/lang/String;", "getTaskId", "()Ljava/lang/String;", "setTaskId", "(Ljava/lang/String;)V", "LIO1010;", "_actionChannel", "LIO1010;", "LOOlloO;", "actionChannel", "LOOlloO;", "getActionChannel", "()LOOlloO;", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class McpToolSet implements ToolSet {
                public static final int $stable = 8;
                private final IO1010 _actionChannel;
                private final OOlloO actionChannel;
                public Context context;
                public O1i1O1I mcpManagerViewModel;
                public String taskId;

                public McpToolSet() {
/* 9 */             IIIII1OI1 iiiii1oi1I00000oIO = iOl1iOi0I.I00000oIO(Integer.MAX_VALUE, null, null, 6);
/* 13 */            this._actionChannel = iiiii1oi1I00000oIO;
/* 15 */            this.actionChannel = iiiii1oi1I00000oIO;
                }

                private final void logMcpExecution(boolean success, String errorType) {
/* 1 */             getTaskId();
/* 4 */             FirebaseAnalytics firebaseAnalyticsI00000oIO = iOIii1ooOi0I.I00000oIO();
/* 8 */             if (firebaseAnalyticsI00000oIO != null) {
/* 10 */                Ilo0li0l1[] ilo0li0l1Arr = Ilo0li0l1.I00iOIl;
/* 14 */                Bundle bundle = new Bundle();
/* 23 */                bundle.putString("capability_name", getTaskId());
/* 28 */                bundle.putBoolean("success", success);
/* 35 */                if (errorType.length() > 0) {
/* 39 */                    bundle.putString("error_type", errorType);
                        }
/* 44 */                firebaseAnalyticsI00000oIO.I00000oIO("mcp_execution", bundle);
                    }
                }

                public final OOlloO getActionChannel() {
/* 1 */             return this.actionChannel;
                }

                public final Context getContext() {
/* 1 */             Context context = this.context;
/* 3 */             if (context != null) {
/* 5 */                 return context;
                    }
/* 8 */             O0000Ioio00.I000OOo1O("context");
/* 20 */            throw null;
                }

                public final O1i1O1I getMcpManagerViewModel() {
/* 1 */             O1i1O1I o1i1O1I = this.mcpManagerViewModel;
/* 3 */             if (o1i1O1I != null) {
/* 5 */                 return o1i1O1I;
                    }
/* 8 */             O0000Ioio00.I000OOo1O("mcpManagerViewModel");
/* 20 */            throw null;
                }

                public final String getTaskId() {
/* 1 */             String str = this.taskId;
/* 3 */             if (str != null) {
/* 5 */                 return str;
                    }
/* 8 */             O0000Ioio00.I000OOo1O("taskId");
/* 20 */            throw null;
                }

                @Tool(description = "Run a MCP tool")
                public final Map<String, String> runMcpTool(@ToolParam(description = "The name of the tool to run.") String toolName, @ToolParam(description = "The parameters passed to tool as input") String input) {
/* 1 */             IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 19 */            return (Map) iOi1IOoIO0l.I00000oIO(Ii1oo1ooill0.I00iiI, new I0iOlI010ii(this, toolName, input, null, 2));
                }

                public final void sendAgentAction(I0i1Io action) {
/* 10 */            iOi1IOoIO0l.I00000oIO(IiiIil1lOIO.I00000oIO, new O1iIlllIoo(this, action, null, 0));
                }

                public final void setContext(Context context) {
/* 1 */             this.context = context;
                }

                public final void setMcpManagerViewModel(O1i1O1I o1i1O1I) {
/* 1 */             this.mcpManagerViewModel = o1i1O1I;
                }

                public final void setTaskId(String str) {
/* 1 */             this.taskId = str;
                }
            }
