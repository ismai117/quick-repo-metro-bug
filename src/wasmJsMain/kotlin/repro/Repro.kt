package repro

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.slack.circuit.subcircuit.SubCircuitInject
import com.slack.circuit.subcircuit.SubCircuitOuterEvent
import com.slack.circuit.subcircuit.SubCircuitUiState
import com.slack.circuit.subcircuit.SubScreen
import com.slack.circuit.subcircuit.SubUi
import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.Inject

interface ReproOuterEvent : SubCircuitOuterEvent

data object ReproKey : SubScreen<ReproOuterEvent>

data class ReproState(val text: String) : SubCircuitUiState

@SubCircuitInject(ReproKey::class, AppScope::class)
@Composable
fun ReproUi(state: ReproState, modifier: Modifier) {

}

//@SubCircuitInject(ReproKey::class, AppScope::class)
//@Inject
//class ReproUi : SubUi<ReproState> {
//    @Composable
//    override fun Content(state: ReproState, modifier: Modifier) {
//
//    }
//}
