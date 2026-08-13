            package com.google.ai.edge.gallery.customtasks.agentchat;

            import android.content.Context;
            import android.os.Bundle;
            import com.google.ai.edge.gallery.common.CallJsSkillResultImage;
            import com.google.ai.edge.gallery.common.CallJsSkillResultWebview;
            import com.google.ai.edge.litertlm.Tool;
            import com.google.ai.edge.litertlm.ToolParam;
            import com.google.ai.edge.litertlm.ToolSet;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.Map;
            import kotlin.Metadata;
            import p000.I00oI0i;
            import p000.I0i1Io;
            import p000.I0iOi0loO;
            import p000.I0iOio0io;
            import p000.I0iOlI010ii;
            import p000.IIIII1OI1;
            import p000.IO1010;
            import p000.Ii1oo1ooill0;
            import p000.IiI0oillOO10;
            import p000.IiiIil1lOIO;
            import p000.Ilo0li0l1;
            import p000.O0000Ioio00;
            import p000.O1Oii0O0loo;
            import p000.O1i1O1I;
            import p000.OIoi0IIoi;
            import p000.OOlloO;
            import p000.Oi010OO0;
            import p000.Ol0ioI1iI;
            import p000.Ol0o1OiOIIIl;
            import p000.OlOoOIi0o;
            import p000.iOIii1ooOi0I;
            import p000.iOi1IOoIO0l;
            import p000.iOl1iOi0I;
            
            @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00072\b\b\u0001\u0010\u0013\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\tJ9\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00180\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u00042\b\b\u0001\u0010\u0017\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00072\b\b\u0001\u0010\u001b\u001a\u00020\u00042\b\b\u0001\u0010\u001c\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\tJ\u0015\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010*\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00101\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u00107\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001e0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001e0@8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR$\u0010F\u001a\u0004\u0018\u00010E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010M\u001a\u0004\u0018\u00010L8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010R¨\u0006S"}, d2 = {"Lcom/google/ai/edge/gallery/customtasks/agentchat/AgentTools;", "Lcom/google/ai/edge/litertlm/ToolSet;", "<init>", "()V", "", "name", "type", "", "guardMissingEntityWithSkillFallback", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;", "", "success", "errorType", "LOoiIlOl1iI;", "logMcpExecution", "(ZLjava/lang/String;)V", "skillName", "loadSkill", "(Ljava/lang/String;)Ljava/util/Map;", "toolName", "input", "runMcpTool", "scriptName", "data", "", "runJs", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;", "intent", "parameters", "runIntent", "LI0i1Io;", "action", "sendAgentAction", "(LI0i1Io;)V", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "LOl0o1OiOIIIl;", "skillManagerViewModel", "LOl0o1OiOIIIl;", "getSkillManagerViewModel", "()LOl0o1OiOIIIl;", "setSkillManagerViewModel", "(LOl0o1OiOIIIl;)V", "LO1i1O1I;", "mcpManagerViewModel", "LO1i1O1I;", "getMcpManagerViewModel", "()LO1i1O1I;", "setMcpManagerViewModel", "(LO1i1O1I;)V", "taskId", "Ljava/lang/String;", "getTaskId", "()Ljava/lang/String;", "setTaskId", "(Ljava/lang/String;)V", "LIO1010;", "_actionChannel", "LIO1010;", "LOOlloO;", "actionChannel", "LOOlloO;", "getActionChannel", "()LOOlloO;", "Lcom/google/ai/edge/gallery/common/CallJsSkillResultImage;", "resultImageToShow", "Lcom/google/ai/edge/gallery/common/CallJsSkillResultImage;", "getResultImageToShow", "()Lcom/google/ai/edge/gallery/common/CallJsSkillResultImage;", "setResultImageToShow", "(Lcom/google/ai/edge/gallery/common/CallJsSkillResultImage;)V", "Lcom/google/ai/edge/gallery/common/CallJsSkillResultWebview;", "resultWebviewToShow", "Lcom/google/ai/edge/gallery/common/CallJsSkillResultWebview;", "getResultWebviewToShow", "()Lcom/google/ai/edge/gallery/common/CallJsSkillResultWebview;", "setResultWebviewToShow", "(Lcom/google/ai/edge/gallery/common/CallJsSkillResultWebview;)V", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public class AgentTools implements ToolSet {
                public static final int $stable = 8;
                private final IO1010 _actionChannel;
                private final OOlloO actionChannel;
                public Context context;
                public O1i1O1I mcpManagerViewModel;
                private CallJsSkillResultImage resultImageToShow;
                private CallJsSkillResultWebview resultWebviewToShow;
                public Ol0o1OiOIIIl skillManagerViewModel;
                public String taskId;

                public AgentTools() {
/* 9 */             IIIII1OI1 iiiii1oi1I00000oIO = iOl1iOi0I.I00000oIO(Integer.MAX_VALUE, null, null, 6);
/* 13 */            this._actionChannel = iiiii1oi1I00000oIO;
/* 15 */            this.actionChannel = iiiii1oi1I00000oIO;
                }

                private final Map<String, String> guardMissingEntityWithSkillFallback(String name, String type) {
                    String strI00111O;
/* 5 */             ArrayList arrayListI000OiO = getSkillManagerViewModel().I000OiO();
/* 13 */            if (arrayListI000OiO.isEmpty()) {
/* 57 */                strI00111O = "Tool not found";
                    } else {
/* 16 */                Iterator it = arrayListI000OiO.iterator();
/* 24 */                while (it.hasNext()) {
/* 48 */                    if (O0000Ioio00.I0000O(((Ol0ioI1iI) it.next()).I001i1O0Ol(), OlOoOIi0o.I00OIo(name).toString())) {
/* 52 */                        strI00111O = Oi010OO0.I00111O(type, " not found. Try to run it as a skill");
                                break;
                            }
                        }
/* 57 */                strI00111O = "Tool not found";
                    }
/* 79 */            return O1Oii0O0loo.I0000O(new OIoi0IIoi("error", strI00111O), new OIoi0IIoi("status", "failed"));
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

                public final CallJsSkillResultImage getResultImageToShow() {
/* 1 */             return this.resultImageToShow;
                }

                public final CallJsSkillResultWebview getResultWebviewToShow() {
/* 1 */             return this.resultWebviewToShow;
                }

                public final Ol0o1OiOIIIl getSkillManagerViewModel() {
/* 1 */             Ol0o1OiOIIIl ol0o1OiOIIIl = this.skillManagerViewModel;
/* 3 */             if (ol0o1OiOIIIl != null) {
/* 5 */                 return ol0o1OiOIIIl;
                    }
/* 8 */             O0000Ioio00.I000OOo1O("skillManagerViewModel");
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

                @Tool(description = "Loads a skill.")
                public final Map<String, String> loadSkill(@ToolParam(description = "The name of the skill to load.") String skillName) {
/* 13 */            return (Map) iOi1IOoIO0l.I00000oIO(IiiIil1lOIO.I00000oIO, new I0iOi0loO(this, skillName, null));
                }

                @Tool(description = "Run an Android intent. It is used to interact with the app to perform certain actions.")
                public final Map<String, String> runIntent(@ToolParam(description = "The intent to run.") String intent, @ToolParam(description = "A JSON string containing the parameter values required for the intent.") String parameters) {
/* 13 */            return (Map) iOi1IOoIO0l.I00000oIO(IiiIil1lOIO.I00000oIO, new I0iOi0loO(intent, this, parameters, null));
                }

                @Tool(description = "Runs JS script")
                public final Map<String, Object> runJs(@ToolParam(description = "The name of skill") String skillName, @ToolParam(description = "The script name to run. Use 'index.html' if not provided by user") String scriptName, @ToolParam(description = "The data to pass to the script. Use empty string if not provided by user") String data) {
/* 17 */            return (Map) iOi1IOoIO0l.I00000oIO(IiiIil1lOIO.I00000oIO, new I0iOio0io(skillName, scriptName, data, this, null));
                }

                @Tool(description = "Run a MCP tool")
                public final Map<String, String> runMcpTool(@ToolParam(description = "The name of the tool to run.") String toolName, @ToolParam(description = "The parameters passed to tool as input") String input) {
/* 1 */             IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 19 */            return (Map) iOi1IOoIO0l.I00000oIO(Ii1oo1ooill0.I00iiI, new I0iOlI010ii(this, toolName, input, null, 0));
                }

                public final void sendAgentAction(I0i1Io action) {
/* 10 */            iOi1IOoIO0l.I00000oIO(IiiIil1lOIO.I00000oIO, new I00oI0i(this, action, null, 3));
                }

                public final void setContext(Context context) {
/* 1 */             this.context = context;
                }

                public final void setMcpManagerViewModel(O1i1O1I o1i1O1I) {
/* 1 */             this.mcpManagerViewModel = o1i1O1I;
                }

                public final void setResultImageToShow(CallJsSkillResultImage callJsSkillResultImage) {
/* 1 */             this.resultImageToShow = callJsSkillResultImage;
                }

                public final void setResultWebviewToShow(CallJsSkillResultWebview callJsSkillResultWebview) {
/* 1 */             this.resultWebviewToShow = callJsSkillResultWebview;
                }

                public final void setSkillManagerViewModel(Ol0o1OiOIIIl ol0o1OiOIIIl) {
/* 1 */             this.skillManagerViewModel = ol0o1OiOIIIl;
                }

                public final void setTaskId(String str) {
/* 1 */             this.taskId = str;
                }
            }
