import React from "react";

export default function BuggyReact() {
  const numbers = [2, 4, 6, 8];
  const sum = numbers.reduce((total, number) => total + number, 0);

  return (
    <main>
      <h1>Array Sum</h1>
      <p>Sum: {sums}</p>
    </main>
  );
}
