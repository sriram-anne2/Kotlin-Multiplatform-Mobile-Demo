import SwiftUI
import kmmCommon

func greet() -> String {
    return Greeting().greeting()
}

struct ContentView: View {
    var body: some View {
        Text(greet() + "bro")
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
